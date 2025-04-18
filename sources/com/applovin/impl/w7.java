package com.applovin.impl;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class w7 {
    private final ByteArrayOutputStream a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f8736b;

    public w7() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.f8736b = new DataOutputStream(byteArrayOutputStream);
    }

    public byte[] a(u7 u7Var) {
        this.a.reset();
        try {
            a(this.f8736b, u7Var.a);
            String str = u7Var.f8358b;
            if (str == null) {
                str = "";
            }
            a(this.f8736b, str);
            this.f8736b.writeLong(u7Var.f8359c);
            this.f8736b.writeLong(u7Var.f8360d);
            this.f8736b.write(u7Var.f8361f);
            this.f8736b.flush();
            return this.a.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void a(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
