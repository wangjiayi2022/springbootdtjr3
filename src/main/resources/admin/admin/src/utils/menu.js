const menu = {
    list() {
        return [{
            "backMenu": [{
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "学生",
                    "menuJump": "列表",
                    "tableName": "xuesheng"
                }], "menu": "学生管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "辅导员",
                    "menuJump": "列表",
                    "tableName": "fudaoyuan"
                }], "menu": "辅导员管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "院系奖学金负责人",
                    "menuJump": "列表",
                    "tableName": "yuanxijxjfzr"
                }], "menu": "院系奖学金负责人管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "学校奖学金负责人",
                    "menuJump": "列表",
                    "tableName": "xuexiaojxjfzr"
                }], "menu": "学校奖学金负责人管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "教务处",
                    "menuJump": "列表",
                    "tableName": "jiaowuchu"
                }], "menu": "教务处管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "奖学金类型",
                    "menuJump": "列表",
                    "tableName": "jiangxuejinleixing"
                }], "menu": "奖学金类型管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "奖学金信息",
                    "menuJump": "列表",
                    "tableName": "jiangxuejinxinxi"
                }], "menu": "奖学金信息管理"
            }, {
                "child": [{"buttons": ["查看", "删除"], "menu": "学生成绩", "menuJump": "列表", "tableName": "xueshengchengji"}],
                "menu": "学生成绩管理"
            }, {
                "child": [{"buttons": ["查看", "删除"], "menu": "奖惩信息", "menuJump": "列表", "tableName": "jiangchengxinxi"}],
                "menu": "奖惩信息管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除", "审核"],
                    "menu": "奖学金申请",
                    "menuJump": "列表",
                    "tableName": "jiangxuejinshenqing"
                }], "menu": "奖学金申请管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "公告信息",
                    "menuJump": "列表",
                    "tableName": "gonggaoxinxi"
                }], "menu": "公告信息管理"
            }],
            "frontMenu": [],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "管理员",
            "tableName": "users"
        }, {
            "backMenu": [{
                "child": [{
                    "buttons": ["查看", "申请"],
                    "menu": "奖学金信息",
                    "menuJump": "列表",
                    "tableName": "jiangxuejinxinxi"
                }], "menu": "奖学金信息管理"
            }, {
                "child": [{"buttons": ["查看"], "menu": "学生成绩", "menuJump": "列表", "tableName": "xueshengchengji"}],
                "menu": "学生成绩管理"
            }, {
                "child": [{"buttons": ["查看"], "menu": "奖惩信息", "menuJump": "列表", "tableName": "jiangchengxinxi"}],
                "menu": "奖惩信息管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "奖学金申请",
                    "menuJump": "列表",
                    "tableName": "jiangxuejinshenqing"
                }], "menu": "奖学金申请管理"
            }, {
                "child": [{"buttons": ["查看"], "menu": "公告信息", "menuJump": "列表", "tableName": "gonggaoxinxi"}],
                "menu": "公告信息管理"
            }],
            "frontMenu": [],
            "hasBackLogin": "是",
            "hasBackRegister": "是",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "学生",
            "tableName": "xuesheng"
        }, {
            "backMenu": [{
                "child": [{"buttons": ["查看"], "menu": "学生", "menuJump": "列表", "tableName": "xuesheng"}],
                "menu": "学生管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "学生成绩",
                    "menuJump": "列表",
                    "tableName": "xueshengchengji"
                }], "menu": "学生成绩管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "奖惩信息",
                    "menuJump": "列表",
                    "tableName": "jiangchengxinxi"
                }], "menu": "奖惩信息管理"
            }, {
                "child": [{
                    "buttons": ["查看", "删除", "审核"],
                    "menu": "奖学金申请",
                    "menuJump": "列表",
                    "tableName": "jiangxuejinshenqing"
                }], "menu": "奖学金申请管理"
            }, {
                "child": [{"buttons": ["查看"], "menu": "公告信息", "menuJump": "列表", "tableName": "gonggaoxinxi"}],
                "menu": "公告信息管理"
            }],
            "frontMenu": [],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "辅导员",
            "tableName": "fudaoyuan"
        }, {
            "backMenu": [{
                "child": [{"buttons": ["查看"], "menu": "学生", "menuJump": "列表", "tableName": "xuesheng"}],
                "menu": "学生管理"
            }, {
                "child": [{"buttons": ["查看"], "menu": "学生成绩", "menuJump": "列表", "tableName": "xueshengchengji"}],
                "menu": "学生成绩管理"
            }, {
                "child": [{"buttons": ["查看"], "menu": "奖惩信息", "menuJump": "列表", "tableName": "jiangchengxinxi"}],
                "menu": "奖惩信息管理"
            }, {
                "child": [{
                    "buttons": ["查看", "删除", "审核"],
                    "menu": "奖学金申请",
                    "menuJump": "列表",
                    "tableName": "jiangxuejinshenqing"
                }], "menu": "奖学金申请管理"
            }, {
                "child": [{"buttons": ["查看"], "menu": "公告信息", "menuJump": "列表", "tableName": "gonggaoxinxi"}],
                "menu": "公告信息管理"
            }],
            "frontMenu": [],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "教务处",
            "tableName": "jiaowuchu"
        }]
    }
}
export default menu;
