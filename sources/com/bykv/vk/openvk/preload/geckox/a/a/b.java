package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

@SuppressLint({"CI_StaticFieldLeak"})
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f13182a = new d();
    public static final b b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final b f13183c = new e();

    /* renamed from: d, reason: collision with root package name */
    protected a f13184d;

    /* renamed from: e, reason: collision with root package name */
    protected File f13185e;

    /* renamed from: f, reason: collision with root package name */
    protected List<String> f13186f;

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.f13184d = aVar;
        this.f13185e = file;
        this.f13186f = list;
    }
}
