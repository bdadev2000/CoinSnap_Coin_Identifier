package com.apm.insight;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Map<CrashType, List<AttachUserData>> f5620a = new HashMap();
    private Map<CrashType, List<AttachUserData>> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f5621c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private ICrashFilter f5622d = null;

    private void c(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> list;
        if (this.f5620a.get(crashType) == null) {
            list = new ArrayList<>();
            this.f5620a.put(crashType, list);
        } else {
            list = this.f5620a.get(crashType);
        }
        list.add(attachUserData);
    }

    private void d(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> list;
        if (this.b.get(crashType) == null) {
            list = new ArrayList<>();
            this.b.put(crashType, list);
        } else {
            list = this.b.get(crashType);
        }
        list.add(attachUserData);
    }

    private void e(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> list = this.f5620a.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    private void f(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> list = this.b.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    @Nullable
    public List<AttachUserData> a(CrashType crashType) {
        return this.f5620a.get(crashType);
    }

    @Nullable
    public ICrashFilter b() {
        return this.f5622d;
    }

    public Map<String, String> a() {
        return this.f5621c;
    }

    @Nullable
    public List<AttachUserData> b(CrashType crashType) {
        return this.b.get(crashType);
    }

    public void a(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            c(CrashType.LAUNCH, attachUserData);
            c(CrashType.JAVA, attachUserData);
            c(CrashType.CUSTOM_JAVA, attachUserData);
            c(CrashType.NATIVE, attachUserData);
            c(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        c(crashType, attachUserData);
    }

    public void b(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            d(CrashType.LAUNCH, attachUserData);
            d(CrashType.JAVA, attachUserData);
            d(CrashType.CUSTOM_JAVA, attachUserData);
            d(CrashType.NATIVE, attachUserData);
            d(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        d(crashType, attachUserData);
    }

    public void a(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            e(CrashType.LAUNCH, attachUserData);
            e(CrashType.JAVA, attachUserData);
            e(CrashType.CUSTOM_JAVA, attachUserData);
            e(CrashType.NATIVE, attachUserData);
            e(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        e(crashType, attachUserData);
    }

    public void b(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            f(CrashType.LAUNCH, attachUserData);
            f(CrashType.JAVA, attachUserData);
            f(CrashType.CUSTOM_JAVA, attachUserData);
            f(CrashType.NATIVE, attachUserData);
            f(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        f(crashType, attachUserData);
    }

    public void a(ICrashFilter iCrashFilter) {
        this.f5622d = iCrashFilter;
    }

    public void a(Map<? extends String, ? extends String> map) {
        this.f5621c.putAll(map);
    }
}
