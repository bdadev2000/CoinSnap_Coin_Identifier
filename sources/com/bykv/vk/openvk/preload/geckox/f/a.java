package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.g.c;
import com.bykv.vk.openvk.preload.geckox.utils.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f13258a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public volatile File f13259c;

    /* renamed from: d, reason: collision with root package name */
    volatile Long f13260d;

    /* renamed from: e, reason: collision with root package name */
    public AtomicBoolean f13261e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.preload.geckox.f.a.a f13262f;

    public a(String str, String str2) {
        this.f13258a = str;
        this.b = str2;
    }

    private synchronized File c(String str) throws Exception {
        if (this.f13259c != null) {
            return this.f13259c;
        }
        if (this.f13260d != null && this.f13260d.longValue() == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13258a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        sb.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.g.b a6 = com.bykv.vk.openvk.preload.geckox.g.b.a(sb.toString());
        try {
            if (this.f13260d == null) {
                this.f13260d = j.a(new File(this.f13258a, str));
            }
            if (this.f13260d == null) {
                this.f13260d = -1L;
                a6.a();
                return null;
            }
            File file = new File(this.f13258a, str2 + str + str2 + this.f13260d + str2 + "using.lock");
            this.f13259c = file.getParentFile();
            c.a(file.getAbsolutePath());
            File file2 = this.f13259c;
            a6.a();
            return file2;
        } catch (Throwable th) {
            a6.a();
            throw th;
        }
    }

    public final synchronized com.bykv.vk.openvk.preload.geckox.f.a.a a(String str) throws Exception {
        if (this.f13262f != null) {
            return this.f13262f;
        }
        File c9 = c(str);
        if (c9 != null) {
            File file = new File(c9, "res.macv");
            File file2 = new File(c9, "res");
            if (file2.exists() && file2.isDirectory()) {
                this.f13262f = new com.bykv.vk.openvk.preload.geckox.f.a.c(c9);
            } else if (file.exists() && file.isFile()) {
                this.f13262f = new com.bykv.vk.openvk.preload.geckox.f.a.b(c9);
            } else {
                throw new RuntimeException("can not find res, dir:" + c9.getAbsolutePath());
            }
            return this.f13262f;
        }
        throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
    }

    public final int b(String str) {
        try {
            File file = new File(c(str), "res");
            if (file.exists() && file.isDirectory()) {
                int length = file.listFiles().length;
                if (length > 0) {
                    return length - 1;
                }
                return 0;
            }
            return 0;
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }
}
