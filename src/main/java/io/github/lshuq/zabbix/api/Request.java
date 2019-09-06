package io.github.lshuq.zabbix.api;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class Request {
    private String jsonrpc = "2.0";

    private Object params = new Object();

    private String method;

    private String auth;

    private Integer id;

    public void putParam(String key, Object value) {
        ((Map) params).put(key, value);
    }

    public void putParams(List<Object> objectList) {
        this.params = objectList;
    }

    public Object removeParam(String key) {
        return ((Map) params).remove(key);
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public Object getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
