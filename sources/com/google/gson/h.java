package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class h implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final a f12100b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h[] f12101c;

    static {
        a aVar = new a();
        f12100b = aVar;
        f12101c = new h[]{aVar, new h() { // from class: com.google.gson.b
            @Override // com.google.gson.i
            public final String a(Field field) {
                return h.c(field.getName());
            }
        }, new h() { // from class: com.google.gson.c
            @Override // com.google.gson.i
            public final String a(Field field) {
                return h.c(h.b(field.getName(), ' '));
            }
        }, new h() { // from class: com.google.gson.d
            @Override // com.google.gson.i
            public final String a(Field field) {
                return h.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new h() { // from class: com.google.gson.e
            @Override // com.google.gson.i
            public final String a(Field field) {
                return h.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: com.google.gson.f
            @Override // com.google.gson.i
            public final String a(Field field) {
                return h.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: com.google.gson.g
            @Override // com.google.gson.i
            public final String a(Field field) {
                return h.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public h(String str, int i10) {
    }

    public static String b(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f12101c.clone();
    }
}
