# Test API Path (Port: 8080)

## /actuator/health
Example response:
```json
{
   "status":"UP",
   "components":{
      "diskSpace":{
         "status":"UP",
         "details":{
            "total":62725623808,
            "free":46713270272,
            "threshold":10485760,
            "exists":true
         }
      },
      "livenessState":{
         "status":"UP"
      },
      "ping":{
         "status":"UP"
      },
      "readinessState":{
         "status":"UP"
      }
   },
   "groups":[
      "liveness",
      "readiness"
   ]
}
```


## /test/getJson
Example response:
```json
{
  "message": "hello"
}
```

## /test/get500
Example response:
- Directly respone with status code: 500
