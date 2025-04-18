package com.apm.insight;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {
    private Map<CrashType, List<AttachUserData>> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<CrashType, List<AttachUserData>> f2949b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f2950c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private ICrashFilter f2951d = null;

    private void c(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> list;
        if (this.a.get(crashType) == null) {
            list = new ArrayList<>();
            this.a.put(crashType, list);
        } else {
            list = this.a.get(crashType);
        }
        list.add(attachUserData);
    }

    private void d(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> list;
        if (this.f2949b.get(crashType) == null) {
            list = new ArrayList<>();
            this.f2949b.put(crashType, list);
        } else {
            list = this.f2949b.get(crashType);
        }
        list.add(attachUserData);
    }

    private void e(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> list = this.a.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    private void f(CrashType crashType, AttachUserData attachUserData) {
        List<AttachUserData> list = this.f2949b.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    @Nullable
    public List<AttachUserData> a(CrashType crashType) {
        return this.a.get(crashType);
    }

    @Nullable
    public ICrashFilter b() {
        return this.f2951d;
    }

    public Map<String, String> a() {
        return this.f2950c;
    }

    @Nullable
    public List<AttachUserData> b(CrashType crashType) {
        return this.f2949b.get(crashType);
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
        this.f2951d = iCrashFilter;
    }

    public void a(Map<? extends String, ? extends String> map) {
        this.f2950c.putAll(map);
    }
}
