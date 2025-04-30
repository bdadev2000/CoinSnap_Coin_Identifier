package com.applovin.impl;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class w7 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f11949a;
    private final DataOutputStream b;

    public w7() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f11949a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public byte[] a(u7 u7Var) {
        this.f11949a.reset();
        try {
            a(this.b, u7Var.f11571a);
            String str = u7Var.b;
            if (str == null) {
                str = "";
            }
            a(this.b, str);
            this.b.writeLong(u7Var.f11572c);
            this.b.writeLong(u7Var.f11573d);
            this.b.write(u7Var.f11574f);
            this.b.flush();
            return this.f11949a.toByteArray();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static void a(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
