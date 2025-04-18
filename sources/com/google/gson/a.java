package com.google.gson;

import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public enum a extends h {
    public a() {
        super("IDENTITY", 0);
    }

    @Override // com.google.gson.i
    public final String a(Field field) {
        return field.getName();
    }
}
