package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

@SuppressLint({"CI_StaticFieldLeak"})
/* loaded from: classes.dex */
public abstract class b {
    public static final b a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final b f10010b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final b f10011c = new e();

    /* renamed from: d, reason: collision with root package name */
    protected a f10012d;

    /* renamed from: e, reason: collision with root package name */
    protected File f10013e;

    /* renamed from: f, reason: collision with root package name */
    protected List<String> f10014f;

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.f10012d = aVar;
        this.f10013e = file;
        this.f10014f = list;
    }
}
