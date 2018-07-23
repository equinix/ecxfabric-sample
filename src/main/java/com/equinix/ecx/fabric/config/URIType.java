/*
 * The Apache License
 *
 * Copyright 2017 Equinix Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.equinix.ecx.fabric.config;

import lombok.Getter;

/**
 * @author aanchala 7/12/2018
 **/
public enum URIType {

    OAUTH("/oauth2/v1/token","Oauth2 Token API"),
    SELLER_PROFILES("/ecx/v3/l2/serviceprofiles/services","Fetch all seller profile for given metros"),
    SELLER_PROFILES_BY_UUID("/ecx/v3/l2/serviceprofiles/services/{uuid}","Fetch all seller profile based on uuid"),
    METRO("/ecx/v3/l2/common/metros","Return list of all metros"),
    CONNECTIONS("/ecx/v3/l2/connections","Return list of all metros"),
    CRUD_CONNECTIONS("/ecx/v3/l2/connections/{connId}","Return list of all metros"),
    VALIDATE_AUTHKEY("/ecx/v3/l2/connections/validateAuthorizationKey","Return list of all metros"),
    BUYER_CONNECTIONS("/ecx/v3/l2/buyer/connections","As a buyer fetch all my connections to service profiles"),
    BUYER_PREFERENCES("/ecx/v3/l2/buyerPreference", "Buyer Preferences"),
    USERPORT("/ecx/v3/port/userport","Fetch List of virtualPorts");

    private final String version="/v1/serviceProvider";

    private String pathSegment;
    @Getter
    private String type;

    URIType(String path, String type) {
        this.pathSegment = path;
        this.type = type;
    }

    public String path(){
        return  this.pathSegment;
    }
}
