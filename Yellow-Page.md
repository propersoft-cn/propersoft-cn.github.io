|内容|说明|版本|
|:--|:--|:--|
|PEP|平台。|20180725|
|ICMP|掌上办公。|20180706|
|IHOS|掌上就医。|20180706|

---

## Zabbix

* [zabbix](https://cloud.propersoft.cn/zabbix)

---

## 推送服务

### 正式环境

* [后台](http://39.106.53.71:29091/pep-push/)：[持续集成](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PepPush)，手动部署

### 测试环境

* [测试环境](http://202.199.100.174:29091/pep-push/)

## 消息中心

### 正式环境

* [desktop](http://push.propersoft.cn/admin)：[持续集成](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PepDesktop)，手动部署
* [后台](http://push.propersoft.cn/pep-push)：[持续发布](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PepPush_new)

### 测试环境

* [desktop](http://push2.propersoft.cn/admin)：[持续发布](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PepPushTestDesktop)
* [后台](http://push2.propersoft.cn/pep-push)：[持续发布](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PepPushTest)

---

## PEP

### API

* 内网
    * [api](http://192.168.1.111/pea/api/api.html)，[持续发布](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PeaApi)
    * [api-dev](http://192.168.1.111/pea/api-dev/api.html)
    * [merge](http://192.168.1.111/pea/merge/api.html)
    * [swagger](http://192.168.1.111/pep-swagger-app/swagger-ui.html)，[持续发布](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PepSwagger)
	

### 前端

* 外网
    * [master](https://cloud.propersoft.cn/pea/master/)，[持续发布](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PeaCdMaster)
    * [develop](https://cloud.propersoft.cn/pea/develop/)，[持续发布](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PeaCdDevelop)

* 内网
    * [master](http://192.168.1.111/pea/master/)
    * [develop](http://192.168.1.111/pea/develop/)，[持续发布](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PeaCd_localhost)

### 后端

* [持续集成](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PepParallel)
* 内网
    * [master](http://192.168.1.111/pep/master/)，[持续发布](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PepMasterCd)
    * [develop](http://192.168.1.111/pep/develop/)，[持续发布](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PepCdDevelop)

###  阿里云公网测试	

* [develop](http://test.propersoft.cn/pep/develop/)，[持续发布](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PepCdDevelop_2)
* [后台](http://test.propersoft.cn/pea/develop/)，[持续发布](https://cloud.propersoft.cn/teamcities/viewType.html?buildTypeId=ProperEnterprise_PeaCd)	

---

## ICMP-产品

|**CI名称**|**说明**|**CD地址**|**更新类型**|
|:--|:--|:--|:--|
|app |掌上办公阿里云验证环境|[https://cloud.propersoft.cn/icmp/app/](https://cloud.propersoft.cn/icmp/app/)|自动|
|||[https://cloud.propersoft.cn/icmp/app-im/](https://cloud.propersoft.cn/icmp/app-im/)||
|||[https://cloud.propersoft.cn/icmp/app-dev/](https://cloud.propersoft.cn/icmp/app-dev/)||
|app-im本地测试环境 |掌上办公产品APP本地测试环境。|[http://192.168.1.111/icmp/app-im/](http://192.168.1.111/icmp/app-im/)|自动|
|app各医院项目 |用于打包宁波、省人民、北辰等项目包。|||
|check-app |掌上办公产品app端代码检查。|[https://cloud.propersoft.cn/icmp/merge/](https://cloud.propersoft.cn/icmp/merge/)|自动|
|check-server |掌上办公产品后台server分支代码检查|||
|check-server-dev |掌上办公产品后台server-dev分支代码检查|||
|ICMP-API文档 |掌上办公api接口文档|[http://192.168.1.111/icmp/api/api.html](http://192.168.1.111/icmp/api/api.html)|自动|
|||[http://192.168.1.111/icmp/api-dev/api.html](http://192.168.1.111/icmp/api-dev/api.html)||
|||[http://192.168.1.111/icmp/api-im/api.html](http://192.168.1.111/icmp/api-im/api.html)||
|||[http://192.168.1.111/icmp/merge/api.html](http://192.168.1.111/icmp/merge/api.html)||
|ICMP-desktop-本地测试 |掌上办公产品前端本地测试环境。|[http://192.168.1.111/icmp/desktop/](http://192.168.1.111/icmp/desktop/)|自动|
|ICMP-server-dev本地测试|掌上办公产品后台本地测试环境。|[http://192.168.1.111/icmp/server-dev](http://192.168.1.111/icmp/server-dev)|自动|

### ICMP-webim

* [web-im](https://icmp2.propersoft.cn/icmp/web-im/)：[持续发布](https://cloud.propersoft.cn/tc-icmp/viewType.html?buildTypeId=Icmp_IcmpWebim)

## ICMP-普日协同办公

|**CI名称**|**说明**|**CD地址**|**更新类型**|
|:--|:--|:--|:--|
|app-im-174外网dev环境 |普日协同办公项目APP测试环境。|[https://icmp2.propersoft.cn/icmp/](https://icmp2.propersoft.cn/icmp/)|自动|
|app-im-174灰度环境|普日协同办公项目APP灰度测试环境。|[https://icmp2.propersoft.cn/icmp-dev/](https://icmp2.propersoft.cn/icmp-dev/)|自动|
|app-im-pr正式apk |普日协同办公项目APP打包正式环境。|[https://icmp.propersoft.cn/propersoft](https://icmp.propersoft.cn/propersoft)|手动|
|app-im-阿里云demo环境|掌上办公客户演示环境。|[https://icmp.propersoft.cn/demo/app/](https://icmp.propersoft.cn/demo/app/)|手动|
|cordova-easemob|自动更新环信插件到私服。|||

### 正式版

* desktop：[外网](https://icmp.propersoft.cn/propersoft/web/) / [内网](http://192.168.1.111/propersoft/web/)，[持续集成](https://cloud.propersoft.cn/tc-icmp/viewType.html?buildTypeId=Icmp_pr_DesktopPr)，手动部署
* [后台](https://icmp.propersoft.cn/propersoft/api/)：[server-dev](https://gitlab.com/propersoft/icmp/propersoft/tree/server-dev)，[持续集成](https://cloud.propersoft.cn/tc-icmp/viewType.html?buildTypeId=Icmp_pr_ServerPr)，手动部署

### 抢先版

![Android](./Yellow-Page/preview-android.png)
![iOS](./Yellow-Page/preview-ios.png)

* [热部署](https://icmp2.propersoft.cn/icmp-dev/chcp.json)
* [desktop](https://icmp2.propersoft.cn/icmp/web/)：[持续发布](https://cloud.propersoft.cn/tc-icmp/viewType.html?buildTypeId=Icmp_pr_Desktop)
* [后台](https://icmp2.propersoft.cn/icmp/server-dev/)：[server-dev](https://gitlab.com/propersoft/icmp/propersoft/tree/server-dev)，[持续发布](https://cloud.propersoft.cn/tc-icmp/viewType.html?buildTypeId=Icmp_pr_Server174dev)

### 阿里云演示环境

* [后台](https://icmp.propersoft.cn/demo/api/)：[server](https://gitlab.com/propersoft/icmp/propersoft/tree/server)，[持续集成](https://cloud.propersoft.cn/tc-icmp/viewType.html?buildTypeId=Icmp_aly_demo_Server)，手动部署

### 阿里云公网测试环境

* [desktop](https://test.propersoft.cn/propersoft/web/)：[持续集成](https://cloud.propersoft.cn/tc-icmp/viewType.html?buildTypeId=Icmp_pr_DesktopPr_2)
* [后台](https://test.propersoft.cn/propersoft/api/)：[持续集成](https://cloud.propersoft.cn/tc-icmp/viewType.html?buildTypeId=Icmp_pr_ServerPr_2)
* [app打包持续发布](https://cloud.propersoft.cn/tc-icmp/viewType.html?buildTypeId=Icmp_pr_AppImPrApk)
* [app下载地址](http://test.propersoft.cn/app/download/android-armv7-release.apk)

## ICMP-YKRM

|**CI名称**|**说明**|**CD地址**|**更新类型**|
|:--|:--|:--|:--|
|YKRM-app正式环境|营口人民项目办公APP打包正式环境。|[https://ykrm.fdjkyl.org/icmp/app/](https://ykrm.fdjkyl.org/icmp/app/)|手动|
|YKRM-app本地测试 |营口人民项目办公APP打包本地测试环境。|[http://192.168.1.111/ykrm/app/](http://192.168.1.111/ykrm/app/)|自动|
|YKRM-app阿里云演示环境|营口人民项目办公APP打包阿里云环境。|[https://ykrm.propersoft.cn/icmp/app-im/](https://ykrm.propersoft.cn/icmp/app-im/)|自动|
|ykrm-desktop阿里云演示环境 |营口人民项目办公管理端阿里云演示环境。|[https://ykrm.propersoft.cn/icmp/desktop/](https://ykrm.propersoft.cn/icmp/desktop/)|自动|
|ykrm-server本地测试环境|营口人民项目办公后台本地环境。|[http://192.168.1.111/ykrm/server](http://192.168.1.111/ykrm/server)|自动|
|ykrm-server阿里云演示环境|营口人民项目办公后台阿里云演示环境。|[https://ykrm.propersoft.cn/icmp/server](https://ykrm.propersoft.cn/icmp/server)|自动|
|ykrm-server-dev正式环境|营口人民项目办公后台正式环境。||手动|

---

## IHOS-产品

|**CI名称**|**说明**|**CD地址**|**更新类型**|
|:--|:--|:--|:--|
|app-cloud演示 |掌上就医阿里云演示环境|[https://cloud.propersoft.cn/ihos/app/](https://cloud.propersoft.cn/ihos/app/)|手动|
|app-本地测试 |掌上就医本地测试环境|[http://192.168.1.101/ihos/app-dev/](http://192.168.1.101/ihos/app-dev/)|自动|
|check-admin |掌上就医旧版管理端代码检查|[http://192.168.1.101/ihos/admin/](http://192.168.1.101/ihos/admin/)|自动|
|check-app |掌上就医app代码检查|[http://192.168.1.101/ihos/app-dev/](http://192.168.1.101/ihos/app-dev/)|自动|
|check-desktop |掌上就医管理端代码检查|[http://192.168.1.101/ihos/desktop/](http://192.168.1.101/ihos/desktop/)|自动|
|check-server |掌上就医后端代码检查||自动|
|IHOS-API文档 |掌上就医API接口文档自动发布|[http://192.168.1.101/ihos/api/api.html](http://192.168.1.101/ihos/api/api.html)|自动|
|||[http://192.168.1.101/ihos/api-dev/api.html](http://192.168.1.101/ihos/api-dev/api.html)||
|||[http://192.168.1.101/ihos/merge/api.html](http://192.168.1.101/ihos/merge/api.html)||
|server |掌上就医后台server分支本地测试|[http://192.168.1.101/ihos/server/](http://192.168.1.101/ihos/server/)|自动|
|server-dev |掌上就医后台server-dev分支本地测试|[http://192.168.1.101/ihos/server-dev/](http://192.168.1.101/ihos/server-dev/)|自动|

## IHOS-YKRM

|**CI名称**|**说明**|**CD地址**|**更新类型**|
|:--|:--|:--|:--|
|check-app |营口人民项目app端代码自动检查||自动|
|ykrm-admin正式环境 |营口人民项目管理端正式环境|[https://ykrm.fdjkyl.org/ihos/admin/](https://ykrm.fdjkyl.org/ihos/admin/)|手动|
|ykrm-app本地测试环境 |营口人民项目app打包本地测试环境|[http://192.168.1.101/ihos/app-dev/](http://192.168.1.101/ihos/app-dev/)|自动|
|ykrm-app正式环境 |营口人民项目app打包正式环境|[https://ykrm.fdjkyl.org/ihos/app/](https://ykrm.fdjkyl.org/ihos/app/)|手动|
|ykrm-app阿里云测试环境 |营口人民项目app打包阿里云测试环境|[https://ykrm.propersoft.cn/ihos/app-dev/](https://ykrm.propersoft.cn/ihos/app-dev/)|自动|
|ykrm-desktop本地环境 |营口人民项目管理端本地测试环境|[http://192.168.1.101/ykrm/desktop/](http://192.168.1.101/ykrm/desktop/)|自动|
|ykrm-desktop阿里云演示环境 |营口人民项目管理端阿里云测试环境|[https://ykrm.propersoft.cn/ihos/desktop/](https://ykrm.propersoft.cn/ihos/desktop/)|自动|
|ykrm-server本地测试环境 |营口人民项目后台本地测试环境|[http://192.168.1.101/ykrm/server](http://192.168.1.101/ykrm/server)|自动|
|ykrm-server正式环境 |营口人民项目后台正式环境|[https://ykrm.fdjkyl.org/ihos/server](https://ykrm.fdjkyl.org/ihos/server)|手动|
|ykrm-server阿里云演示环境 |营口人民项目后台阿里云测试环境|[https://ykrm.propersoft.cn/ihos/server](https://ykrm.propersoft.cn/ihos/server)|自动|
