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
package com.equinix.ecx.fabric.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aanchala 7/13/2018
 **/
public @Data class PortsResponse {

    private String uuid;
    private String name;
    private String provisionStatus;
    private String region;
    private String device;
    private Long totalBandwidth;
    private boolean buyout;
    private String custOrgId;
    private String ibx;
    private boolean isLayer3Enabled;
    private String metroCode;
    private String metroDescription;
    private String deviceGroup;
    private String devicePriority;
    private String encapsulation;
    private boolean isLag;
    private boolean viewPortPermission;
    private boolean placeVcOrderPermission;

    private String createdDate;
    private String lastUpdatedDate;


    List<UserPort> userPorts = new ArrayList<UserPort>();

    @Override
    public String toString() {
        return "PortsResponse{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", provisionStatus='" + provisionStatus + '\'' +
                ", region='" + region + '\'' +
                ", device='" + device + '\'' +
                ", totalBandwidth=" + totalBandwidth +
                ", buyout=" + buyout +
                ", custOrgId='" + custOrgId + '\'' +
                ", ibx='" + ibx + '\'' +
                ", isLayer3Enabled=" + isLayer3Enabled +
                ", metroCode='" + metroCode + '\'' +
                ", metroDescription='" + metroDescription + '\'' +
                ", deviceGroup='" + deviceGroup + '\'' +
                ", devicePriority='" + devicePriority + '\'' +
                ", encapsulation='" + encapsulation + '\'' +
                ", isLag=" + isLag +
                ", viewPortPermission=" + viewPortPermission +
                ", placeVcOrderPermission=" + placeVcOrderPermission +
                ", createdDate='" + createdDate + '\'' +
                ", lastUpdatedDate='" + lastUpdatedDate + '\'' +
                ", userPorts=" + userPorts +
                '}';
    }
}
