package com.bykv.vk.openvk.preload.geckox.model;

import com.bykv.vk.openvk.preload.a.a.c;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ComponentModel {

    @c(a = "packages")
    private Map<String, List<UpdatePackage>> packages;

    @c(a = "universal_strategies")
    private Map<String, b> universalStrategies;

    /* loaded from: classes.dex */
    public static class a {

        @c(a = com.mbridge.msdk.foundation.controller.a.a)
        public String a;

        /* renamed from: b, reason: collision with root package name */
        @c(a = "clean_type")
        public int f10104b;

        /* renamed from: c, reason: collision with root package name */
        @c(a = "version")
        public List<Long> f10105c;
    }

    /* loaded from: classes.dex */
    public static class b {

        @c(a = "specified_clean")
        public List<a> a;
    }

    public Map<String, List<UpdatePackage>> getPackages() {
        return this.packages;
    }

    public Map<String, b> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
