package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.g.c;
import com.bykv.vk.openvk.preload.geckox.utils.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f10083b;

    /* renamed from: c, reason: collision with root package name */
    public volatile File f10084c;

    /* renamed from: d, reason: collision with root package name */
    volatile Long f10085d;

    /* renamed from: e, reason: collision with root package name */
    public AtomicBoolean f10086e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.preload.geckox.f.a.a f10087f;

    public a(String str, String str2) {
        this.a = str;
        this.f10083b = str2;
    }

    private synchronized File c(String str) throws Exception {
        if (this.f10084c != null) {
            return this.f10084c;
        }
        if (this.f10085d != null && this.f10085d.longValue() == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.a);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.g.b a = com.bykv.vk.openvk.preload.geckox.g.b.a(sb2.toString());
        try {
            if (this.f10085d == null) {
                this.f10085d = j.a(new File(this.a, str));
            }
            if (this.f10085d == null) {
                this.f10085d = -1L;
                return null;
            }
            File file = new File(this.a, str2 + str + str2 + this.f10085d + str2 + "using.lock");
            this.f10084c = file.getParentFile();
            c.a(file.getAbsolutePath());
            return this.f10084c;
        } finally {
            a.a();
        }
    }

    public final synchronized com.bykv.vk.openvk.preload.geckox.f.a.a a(String str) throws Exception {
        if (this.f10087f != null) {
            return this.f10087f;
        }
        File c10 = c(str);
        if (c10 != null) {
            File file = new File(c10, "res.macv");
            File file2 = new File(c10, "res");
            if (file2.exists() && file2.isDirectory()) {
                this.f10087f = new com.bykv.vk.openvk.preload.geckox.f.a.c(c10);
            } else if (file.exists() && file.isFile()) {
                this.f10087f = new com.bykv.vk.openvk.preload.geckox.f.a.b(c10);
            } else {
                throw new RuntimeException("can not find res, dir:" + c10.getAbsolutePath());
            }
            return this.f10087f;
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
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }
}
