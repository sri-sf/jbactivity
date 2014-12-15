define([], function(){      
return {
    "apiVersion": "1.0",
    "icon": "images/icon.png",
    "iconSmall": "images/iconSmall.png",
    "key": "jb_activity_guid",
    "category": "Messaging",
    "version": "1.0.1",
    "type": "REST",
    "lang": {
        "en-US": {
            "name": "Sridhar's Log",
            "description": "post a message to sridhar's log"
        }
    },
    "execute": {
        "inArguments": [
            { "myProperty1": "myProperty1 value" },
            { "myEventData": "myEvent.DataBinding" }
        ],
        "outArguments": [],
        "uri": "/execute",
        "verb": "POST",
        "body": "",
        "header": "",
        "format": "json",
        "useJwt": false,
        "timeout": 3000
    },
    "save": {
        "uri": "/save",
        "body": "",
        "verb": "POST",
        "useJwt": false,
        "timeout" : 3000
    },
    "publish": {
        "uri": "/publish",
        "verb": "POST",
        "body": "",
        "useJwt": false,
        "timeout" : 3000        
    },
    "validate": {
        "uri": "/validate",
        "verb": "POST",
        "body": "",
        "useJwt": false,
        "timeout": 3000        
    },
    "edit": {
        "uri": "",
        "height": 200,
        "width": 300
    }
};
});
