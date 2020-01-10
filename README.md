This is a service that will accept HTTP GET requests at:

**http://localhost:8080/check**

and respond with a JSON representation of an IP address status check, with text output on the command line:

**{"ip":"255.255.255.0","status":"Unreachable"}**

You can customize the greeting with an optional `ip` parameter in the query string:

**http://localhost:8080/check?ip=192.168.1.130**

The `ip` parameter value overrides the default value of "255.255.255.0" and is reflected in the response:

**{"ip":"192.168.1.130","status":"Reachable"}**
