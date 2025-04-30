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

        /* renamed from: a, reason: collision with root package name */
        @c(a = com.mbridge.msdk.foundation.controller.a.f15376a)
        public String f13283a;

        @c(a = "clean_type")
        public int b;

        /* renamed from: c, reason: collision with root package name */
        @c(a = "version")
        public List<Long> f13284c;
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @c(a = "specified_clean")
        public List<a> f13285a;
    }

    public Map<String, List<UpdatePackage>> getPackages() {
        return this.packages;
    }

    public Map<String, b> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
