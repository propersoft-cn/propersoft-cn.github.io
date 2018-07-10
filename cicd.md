|内容|说明|版本|备注|||
|:--|:--|:--|:--|:--|:--|
|PEP|平台。|20180706||||
|ICMP|掌上办公。|20180706||||
|IHOS|掌上就医。|20180706||||
|||||||
|CI名称|说明|级别|类型|CD地址|更新类型|
|PEP||||||
|PEA-API文档|PEP接口文档。|内部|测试|[http://192.168.1.111/pea/api/api.html](http://192.168.1.111/pea/api/api.html)|自动|
|||||[http://192.168.1.111/pea/api-dev/api.html](http://192.168.1.111/pea/api-dev/api.html)||
|||||[http://192.168.1.111/pea/merge/api.html](http://192.168.1.111/pea/merge/api.html)||
|PEA-CD-本地测试|PEP前端本地测试。|内部|测试|开发版：http://192.168.1.111/pea/develop/|自动|
|||||发布版：http://192.168.1.111/pea/master/||
|PEA-CD-阿里云-develop|PEP前端开发板外网测试。|内部|测试|[https://cloud.propersoft.cn/pea/develop/](https://cloud.propersoft.cn/pea/develop/)|自动|
|PEA-CD-阿里云-master|PEP前端发布版外网测试。|内部|测试|[https://cloud.propersoft.cn/pea/master/](https://cloud.propersoft.cn/pea/master/)|自动|
|PEP--parallel|PEP后端代码检查。|内部|测试||自动|
|PEP-CD-本地环境-develop |PEP后台开发版本地测试。|内部|测试|[http://192.168.1.111/pep/develop/](http://192.168.1.111/pep/develop/)|自动|
|PEP-CD-本地环境-master|PEP后台发布版本地测试。|内部|测试|[http://192.168.1.111/pep/master/](http://192.168.1.111/pep/master/)|自动|
|pep-push|正式环境推送。|外部|正式|[http://39.106.53.71:29091/pep-push/](http://39.106.53.71)|手动|
|||||||
|CI名称|说明|级别|类型|CD地址|更新类型|
|ICMP-产品||||||
|app |掌上办公阿里云验证环境|外部|测试|[https://cloud.propersoft.cn/icmp/app/](https://cloud.propersoft.cn/icmp/app/)|自动|
|||||[https://cloud.propersoft.cn/icmp/app-im/](https://cloud.propersoft.cn/icmp/app-im/)||
|||||[https://cloud.propersoft.cn/icmp/app-dev/](https://cloud.propersoft.cn/icmp/app-dev/)||
|app-im本地测试环境 |掌上办公产品APP本地测试环境。|内部|测试|[http://192.168.1.111/icmp/app-im/](http://192.168.1.111/icmp/app-im/)|自动|
|app各医院项目 |用于打包宁波、省人民、北辰等项目包。|||||
|check-app |掌上办公产品app端代码检查。|外部|测试|[https://cloud.propersoft.cn/icmp/merge/](https://cloud.propersoft.cn/icmp/merge/)|自动|
|check-server |掌上办公产品后台server分支代码检查|||||
|check-server-dev |掌上办公产品后台server-dev分支代码检查|||||
|ICMP-API文档 |掌上办公api接口文档|内部|测试|[http://192.168.1.111/icmp/api/api.html](http://192.168.1.111/icmp/api/api.html)|自动|
|||||[http://192.168.1.111/icmp/api-dev/api.html](http://192.168.1.111/icmp/api-dev/api.html)||
|||||[http://192.168.1.111/icmp/api-im/api.html](http://192.168.1.111/icmp/api-im/api.html)||
|||||[http://192.168.1.111/icmp/merge/api.html](http://192.168.1.111/icmp/merge/api.html)||
|ICMP-desktop-本地测试 |掌上办公产品前端本地测试环境。|内部|测试|[http://192.168.1.111/icmp/desktop/](http://192.168.1.111/icmp/desktop/)|自动|
|ICMP-server-dev本地测试|掌上办公产品后台本地测试环境。|内部|测试|[http://192.168.1.111/icmp/server-dev](http://192.168.1.111/icmp/server-dev)|自动|
|||||||
|ICMP-普日||||||
|app-im-174外网dev环境 |普日协同办公项目APP测试环境。|外部|测试|[https://icmp2.propersoft.cn/icmp/](https://icmp2.propersoft.cn/icmp/)|自动|
|app-im-174灰度环境|普日协同办公项目APP灰度测试环境。|灰度|测试|[https://icmp2.propersoft.cn/icmp-dev/](https://icmp2.propersoft.cn/icmp-dev/)|自动|
|app-im-pr正式apk |普日协同办公项目APP打包正式环境。|外部|正式|[https://icmp.propersoft.cn/propersoft](https://icmp.propersoft.cn/propersoft)|手动|
|app-im-阿里云demo环境|掌上办公客户演示环境。|外部|正式|[https://icmp.propersoft.cn/demo/app/](https://icmp.propersoft.cn/demo/app/)|手动|
|cordova-easemob|自动更新环信插件到私服。|||||
|desktop-174灰度环境|普日协同办公项目PC端测试环境。|外部|测试|[https://icmp2.propersoft.cn/icmp/web/](https://icmp2.propersoft.cn/icmp/web/)|自动|
|desktop-pr正式环境 |普日协同办公项目管理端正式环境。|外部|正式|[https://icmp.propersoft.cn/propersoft/web/](https://icmp.propersoft.cn/propersoft/web/)|手动|
|||||[http://192.168.1.111/propersoft/web/](http://192.168.1.111/propersoft/web/)||
|server-174外网dev环境 |普日协同办公项目后台测试环境。|外部|测试|[https://icmp2.propersoft.cn/icmp/api/](https://icmp2.propersoft.cn/icmp/api/)|自动|
|server-dev-174灰度环境|普日协同办公项目后台灰度测试环境。|灰度|测试|[https://icmp2.propersoft.cn/icmp/server-dev/](https://icmp2.propersoft.cn/icmp/server-dev/)|自动|
|server-pr正式环境 |普日协同办公项目后台正式环境。|外部|正式|[https://icmp.propersoft.cn/propersoft/api/](https://icmp.propersoft.cn/propersoft/api/)|手动|
|server-阿里云demo环境 |普日协同办公项目后台演示环境。|外部|正式|[https://icmp.propersoft.cn/demo/api/](https://icmp.propersoft.cn/demo/api/)|手动|
|ICMP-YKRM||||||
|YKRM-app正式环境|营口人民项目办公APP打包正式环境。|外部|正式|[https://ykrm.fdjkyl.org/icmp/app/](https://ykrm.fdjkyl.org/icmp/app/)|手动|
|YKRM-app本地测试 |营口人民项目办公APP打包本地测试环境。|内部|测试|[http://192.168.1.111/ykrm/app/](http://192.168.1.111/ykrm/app/)|自动|
|YKRM-app阿里云演示环境|营口人民项目办公APP打包阿里云环境。|外部|测试|[https://ykrm.propersoft.cn/icmp/app-im/](https://ykrm.propersoft.cn/icmp/app-im/)|自动|
|ykrm-desktop阿里云演示环境 |营口人民项目办公管理端阿里云演示环境。|外部|测试|[https://ykrm.propersoft.cn/icmp/desktop/](https://ykrm.propersoft.cn/icmp/desktop/)|自动|
|ykrm-server本地测试环境|营口人民项目办公后台本地环境。|内部|测试|[http://192.168.1.111/ykrm/server](http://192.168.1.111/ykrm/server)|自动|
|ykrm-server阿里云演示环境|营口人民项目办公后台阿里云演示环境。|外部|测试|[https://ykrm.propersoft.cn/icmp/server](https://ykrm.propersoft.cn/icmp/server)|自动|
|ykrm-server-dev正式环境|营口人民项目办公后台正式环境。|外部|正式||手动|
|||||||
|CI名称|说明|级别|类型|CD地址|更新类型|
|IHOS-产品||||||
|app-cloud演示 |掌上就医阿里云演示环境|外部|测试|[https://cloud.propersoft.cn/ihos/app/](https://cloud.propersoft.cn/ihos/app/)|手动|
|app-本地测试 |掌上就医本地测试环境|内部|测试|[http://192.168.1.101/ihos/app-dev/](http://192.168.1.101/ihos/app-dev/)|自动|
|check-admin |掌上就医旧版管理端代码检查|内部|测试|[http://192.168.1.101/ihos/admin/](http://192.168.1.101/ihos/admin/)|自动|
|check-app |掌上就医app代码检查|内部|测试|[http://192.168.1.101/ihos/app-dev/](http://192.168.1.101/ihos/app-dev/)|自动|
|check-desktop |掌上就医管理端代码检查|内部|测试|[http://192.168.1.101/ihos/desktop/](http://192.168.1.101/ihos/desktop/)|自动|
|check-server |掌上就医后端代码检查|内部|测试||自动|
|IHOS-API文档 |掌上就医API接口文档自动发布|内部|测试|[http://192.168.1.101/ihos/api/api.html](http://192.168.1.101/ihos/api/api.html)|自动|
|||||[http://192.168.1.101/ihos/api-dev/api.html](http://192.168.1.101/ihos/api-dev/api.html)||
|||||[http://192.168.1.101/ihos/merge/api.html](http://192.168.1.101/ihos/merge/api.html)||
|server |掌上就医后台server分支本地测试|内部|测试|[http://192.168.1.101/ihos/server/](http://192.168.1.101/ihos/server/)|自动|
|server-dev |掌上就医后台server-dev分支本地测试|内部|测试|[http://192.168.1.101/ihos/server-dev/](http://192.168.1.101/ihos/server-dev/)|自动|
|IHOS-YKRM||||||
|check-app |营口人民项目app端代码自动检查|内部|测试||自动|
|ykrm-admin正式环境 |营口人民项目管理端正式环境|外部|正式|[https://ykrm.fdjkyl.org/ihos/admin/](https://ykrm.fdjkyl.org/ihos/admin/)|手动|
|ykrm-app本地测试环境 |营口人民项目app打包本地测试环境|内部|测试|[http://192.168.1.101/ihos/app-dev/](http://192.168.1.101/ihos/app-dev/)|自动|
|ykrm-app正式环境 |营口人民项目app打包正式环境|外部|正式|[https://ykrm.fdjkyl.org/ihos/app/](https://ykrm.fdjkyl.org/ihos/app/)|手动|
|ykrm-app阿里云测试环境 |营口人民项目app打包阿里云测试环境|外部|测试|[https://ykrm.propersoft.cn/ihos/app-dev/](https://ykrm.propersoft.cn/ihos/app-dev/)|自动|
|ykrm-desktop本地环境 |营口人民项目管理端本地测试环境|内部|测试|[http://192.168.1.101/ykrm/desktop/](http://192.168.1.101/ykrm/desktop/)|自动|
|ykrm-desktop阿里云演示环境 |营口人民项目管理端阿里云测试环境|外部|测试|[https://ykrm.propersoft.cn/ihos/desktop/](https://ykrm.propersoft.cn/ihos/desktop/)|自动|
|ykrm-server本地测试环境 |营口人民项目后台本地测试环境|内部|测试|[http://192.168.1.101/ykrm/server](http://192.168.1.101/ykrm/server)|自动|
|ykrm-server正式环境 |营口人民项目后台正式环境|外部|正式|[https://ykrm.fdjkyl.org/ihos/server](https://ykrm.fdjkyl.org/ihos/server)|手动|
|ykrm-server阿里云演示环境 |营口人民项目后台阿里云测试环境|外部|测试|[https://ykrm.propersoft.cn/ihos/server](https://ykrm.propersoft.cn/ihos/server)|自动|
