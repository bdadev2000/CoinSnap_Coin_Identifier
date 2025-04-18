package com.applovin.impl;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class y7 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f28118a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f28119b;

    public y7() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f28118a = byteArrayOutputStream;
        this.f28119b = new DataOutputStream(byteArrayOutputStream);
    }

    public byte[] a(w7 w7Var) {
        this.f28118a.reset();
        try {
            a(this.f28119b, w7Var.f27703a);
            String str = w7Var.f27704b;
            if (str == null) {
                str = "";
            }
            a(this.f28119b, str);
            this.f28119b.writeLong(w7Var.f27705c);
            this.f28119b.writeLong(w7Var.d);
            this.f28119b.write(w7Var.f27706f);
            this.f28119b.flush();
            return this.f28118a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void a(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
