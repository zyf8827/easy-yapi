*   0.2.0
    1.  enhance:support export api to postman`[Code -> ExportPostman]`
*   0.3.0
    1.  enhance:cache api export result
*   0.4.0 ~
    1.  enhance:quick API requests from code`[Alt + Insert -> Call]`
    2.  enhance:support request&response header
    3.  enhance:support download response
    4.  enhance:support host history
    5.  enhance:support response auto format
    6.  (beta)enhance:Export Api As Markdown\[Code -> ExportMarkdown]
    7.  fix:support Post File In `[Call Api Action]`
*   0.5.0 ~
    1.  fix:auto format xml/html response
    2.  fix:set prompt for json response
    3.  fix:optimized the cache
*   0.6.0 ~
    1.  enhance:support ApiDashboard
    2.  enhance:optimized ui
    3.  enhance:auto fix postman collection info
    4.  enhance:support PopupMenu for Postman Tree [(#42)](https://github.com/tangcent/easy-api/issues/42)
    5.  enhance:support clear cache in Setting [(#46)](https://github.com/tangcent/easy-api/issues/46)
    6.  enhance:support generic type of api method[(#48)](https://github.com/tangcent/easy-api/issues/48)
    7.  enhance:optional form parameters[(#53)](https://github.com/tangcent/easy-api/issues/53)
    8.  enhance:try resolve link to yapi [#2](https://github.com/tangcent/easy-yapi/issues/2)
    9.  fix:deserialize int numbers correctly [(#49)](https://github.com/tangcent/easy-api/issues/49)
    10. fix:fix custom module rule in config [(#54)](https://github.com/tangcent/easy-api/issues/54)
    11. fix:support org.springframework.web.bind.annotation.RequestHeader [(#57)](https://github.com/tangcent/easy-api/issues/57)
    12. fix:make sure the path prefix with '/' for yapi [(#9)](https://github.com/tangcent/easy-yapi/issues/9)
    13. enhance:optimize the inference of the return type of the method [(#60)](https://github.com/tangcent/easy-api/issues/60)
    14. enhance:provide http properties settings [(#61)](https://github.com/tangcent/easy-api/issues/61)
    15. enhance:provide more information tips during the export process [(#11)](https://github.com/tangcent/easy-yapi/pull/11)
    16. enhance:set toolTip for postman tree node [(#64)](https://github.com/tangcent/easy-api/pull/64)
    17. enhance:support recommend config [(#66)](https://github.com/tangcent/easy-api/pull/66)
    18. enhance:support YapiDashBoard [(#66)](https://github.com/tangcent/easy-yapi/issues/5)
    19. enhance:support class rule:ignoreField\[json.rule.field.ignore] [(#67)](https://github.com/tangcent/easy-api/pull/67)
*   0.7.0 ~
    1. enhance:provide logging level Settings  [(#68)](https://github.com/tangcent/easy-api/issues/68)
    2. enhance:optimized action interrupt  [(#72)](https://github.com/tangcent/easy-api/pull/72)
    3. fix:support org.springframework.http.HttpEntity/org.springframework.http.ResponseEntity  [(#71)](https://github.com/tangcent/easy-api/issues/71)
*   0.8.0 ~
    1. enhance:process key 'Tab' in request params  [(#85)](https://github.com/tangcent/easy-api/pull/85)
    2. enhance:process Deprecated info on class in RecommendConfig  [(#86)](https://github.com/tangcent/easy-api/pull/86)
    3. enhance:try parse linked option info for form params  [(#87)](https://github.com/tangcent/easy-api/pull/87)
*   0.9.0 ~
    1. enhance:support groovy extension  [(#98)](https://github.com/tangcent/easy-api/pull/98)
    2. enhance:update toolTip of ApiProjectNode in ApiDashBoard  [(#102)](https://github.com/tangcent/easy-api/pull/102)
    3. fix:opti method Infer  [(#103)](https://github.com/tangcent/easy-api/pull/103)
    4. enhance:support export method doc(rpc)  [(#107)](https://github.com/tangcent/easy-api/pull/107)
    5. fix config search[(#113)](https://github.com/tangcent/easy-api/pull/113)
    6. resolve `{@link ...}` in param desc doc[(#117)](https://github.com/tangcent/easy-api/pull/117)
    7. Output path params in 'Export Markdown'[(#118)](https://github.com/tangcent/easy-api/pull/118)
    8. fix:use json instead of form for add cart of yapi [(#44)](https://github.com/tangcent/easy-yapi/pull/44)
*   1.0.0 ~
    1. enhance:support kotlin  [(#125)](https://github.com/tangcent/easy-api/pull/125)
*   1.1.0 ~
    1. enhance:support rule: `name[filter]=value`  [(#138)](https://github.com/tangcent/easy-api/pull/138)
    2. enhance:parse kotlin files in ApiDashboard  [(#141)](https://github.com/tangcent/easy-api/pull/141)
    3. fix: support Serializer for Enum  [(#134)](https://github.com/tangcent/easy-api/issues/134)
    4. fix: fix error base path for APIs in super class  [(#137)](https://github.com/tangcent/easy-api/issues/137)
    5. fix: ApiDashboard not show kotlin module&apis [(#140)](https://github.com/tangcent/easy-api/issues/140)
*   1.2.0 ~
    1. enhance:provide more recommended configurations  [(#153)](https://github.com/tangcent/easy-api/issues/153)
    2. enhance:support for export&import settings [(#167)](https://github.com/tangcent/easy-api/issues/167)
    3. fix: Some icon maybe missing in Windows  [(#164)](https://github.com/tangcent/easy-api/issues/164)   
*   1.3.0 ~
    1. enhance:new rule:`[class.prefix.path]`  [(#181)](https://github.com/tangcent/easy-api/pull/181)
    2. enhance:new rule:`[doc.class]`  [(#178)](https://github.com/tangcent/easy-api/pull/178)
    3. enhance:new rule:`[param.ignore]`  [(#176)](https://github.com/tangcent/easy-api/pull/176)
    4. enhance:import spring properties by recommend [(#181)](https://github.com/tangcent/easy-api/pull/181)
    5. enhance:Auto reload the configuration while context switch [(#185)](https://github.com/tangcent/easy-api/pull/185)
   
*   1.4.0 ~
    1. enhance:support new rule: `api.name`  [(#200)](https://github.com/tangcent/easy-api/pull/200)
    2. enhance:new method `contextType` for rule  [(#201)](https://github.com/tangcent/easy-api/pull/201)
    3. enhance:cache parsed additional `Header`/`Param`  [(#205)](https://github.com/tangcent/easy-api/pull/205)
    4. enhance:ignore param extend HttpServletRequest/HttpServletResponse  [(#206)](https://github.com/tangcent/easy-api/pull/206)
    5. enhance:new rule: `method.default.http.method` [(#207)](https://github.com/tangcent/easy-api/pull/207)
    6. enhance:new rule `field.mock` [(#113)](https://github.com/tangcent/easy-yapi/pull/113)
    7. enhance:provide recommend config for yapi mock [(#116)](https://github.com/tangcent/easy-yapi/pull/116)
   
*   1.5.0 ~
    1. enhance:support setting charset for export markdown  [(#211)](https://github.com/tangcent/easy-api/pull/211)
    2. enhance:add new method `jsonType` for `method`&`field`  [(#213)](https://github.com/tangcent/easy-api/pull/213)
    3. enhance:support scala project   [(#214)](https://github.com/tangcent/easy-api/pull/214)
    4. bug-fix: preserving the order of field in infer   [(#216)](https://github.com/tangcent/easy-api/pull/216)


*   1.7.0 ~
    1. enhance:new rule tool: [helper](http://easyyapi.com/setting/tools/helper.html)  [(#242)](https://github.com/tangcent/easy-api/pull/242)
    2. enhance:support rule: [method.return](http://easyyapi.com/setting/rules/method_return.html)  [(#240)](https://github.com/tangcent/easy-api/pull/240)
    3. enhance:support render yapi desc: [yapi render](http://easyyapi.com/documents/yapi_render.html)  [(#138)](https://github.com/tangcent/easy-api/pull/138)



       