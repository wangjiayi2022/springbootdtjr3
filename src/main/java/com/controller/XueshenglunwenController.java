package com.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.XueshenglunwenEntity;
import com.entity.view.XueshenglunwenView;
import com.service.XueshenglunwenService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;


/**
 * 学生成绩
 * 后端接口
 *
 * @author
 * @email
 * @date 2021-01-28 10:57:06
 */
@RestController
@RequestMapping("/xueshenglunwen")
public class XueshenglunwenController {
    @Autowired
    private XueshenglunwenService xueshenglunwenService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, XueshenglunwenEntity xueshenglunwen, HttpServletRequest request) {

        String tableName = request.getSession().getAttribute("tableName").toString();
        if (tableName.equals("xuesheng")) {
            xueshenglunwen.setXueshengzhanghao((String) request.getSession().getAttribute("username"));
        }
        EntityWrapper<XueshenglunwenEntity> ew = new EntityWrapper<XueshenglunwenEntity>();
        PageUtils page = xueshenglunwenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshenglunwen), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, XueshenglunwenEntity xueshenglunwen, HttpServletRequest request) {
        EntityWrapper<XueshenglunwenEntity> ew = new EntityWrapper<XueshenglunwenEntity>();
        PageUtils page = xueshenglunwenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshenglunwen), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(XueshenglunwenEntity xueshenglunwen) {
        EntityWrapper<XueshenglunwenEntity> ew = new EntityWrapper<XueshenglunwenEntity>();
        ew.allEq(MPUtil.allEQMapPre(xueshenglunwen, "xueshenglunwen"));
        return R.ok().put("data", xueshenglunwenService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshenglunwenEntity xueshenglunwen) {
        EntityWrapper<XueshenglunwenEntity> ew = new EntityWrapper<XueshenglunwenEntity>();
        ew.allEq(MPUtil.allEQMapPre(xueshenglunwen, "xueshenglunwen"));
        XueshenglunwenView xueshenglunwenView = xueshenglunwenService.selectView(ew);
        return R.ok("查询学生成绩成功").put("data", xueshenglunwenView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        XueshenglunwenEntity xueshenglunwen = xueshenglunwenService.selectById(id);
        return R.ok().put("data", xueshenglunwen);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        XueshenglunwenEntity xueshenglunwen = xueshenglunwenService.selectById(id);
        return R.ok().put("data", xueshenglunwen);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshenglunwenEntity xueshenglunwen, HttpServletRequest request) {
        xueshenglunwen.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(xueshenglunwen);

        xueshenglunwenService.insert(xueshenglunwen);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshenglunwenEntity xueshenglunwen, HttpServletRequest request) {
        xueshenglunwen.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(xueshenglunwen);

        xueshenglunwenService.insert(xueshenglunwen);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XueshenglunwenEntity xueshenglunwen, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(xueshenglunwen);
        xueshenglunwenService.updateById(xueshenglunwen);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        xueshenglunwenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
     * 提醒接口
     */
    @RequestMapping("/remind/{columnName}/{type}")
    public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request,
                         @PathVariable("type") String type, @RequestParam Map<String, Object> map) {
        map.put("column", columnName);
        map.put("type", type);

        if (type.equals("2")) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            Date remindStartDate = null;
            Date remindEndDate = null;
            if (map.get("remindstart") != null) {
                Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
                c.setTime(new Date());
                c.add(Calendar.DAY_OF_MONTH, remindStart);
                remindStartDate = c.getTime();
                map.put("remindstart", sdf.format(remindStartDate));
            }
            if (map.get("remindend") != null) {
                Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
                c.setTime(new Date());
                c.add(Calendar.DAY_OF_MONTH, remindEnd);
                remindEndDate = c.getTime();
                map.put("remindend", sdf.format(remindEndDate));
            }
        }

        Wrapper<XueshenglunwenEntity> wrapper = new EntityWrapper<XueshenglunwenEntity>();
        if (map.get("remindstart") != null) {
            wrapper.ge(columnName, map.get("remindstart"));
        }
        if (map.get("remindend") != null) {
            wrapper.le(columnName, map.get("remindend"));
        }

        String tableName = request.getSession().getAttribute("tableName").toString();
        if (tableName.equals("xuesheng")) {
            wrapper.eq("xueshengzhanghao", (String) request.getSession().getAttribute("username"));
        }

        int count = xueshenglunwenService.selectCount(wrapper);
        return R.ok().put("count", count);
    }


}
