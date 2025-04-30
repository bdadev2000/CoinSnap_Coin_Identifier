package com.tools.arruler.models;

import z7.InterfaceC2979a;
import z7.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ImageType {
    public static final ImageType ADS;
    public static final ImageType IMAGE;
    public static final /* synthetic */ ImageType[] b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b f19633c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.tools.arruler.models.ImageType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.tools.arruler.models.ImageType] */
    static {
        ?? r02 = new Enum("IMAGE", 0);
        IMAGE = r02;
        ?? r12 = new Enum("ADS", 1);
        ADS = r12;
        ImageType[] imageTypeArr = {r02, r12};
        b = imageTypeArr;
        f19633c = new b(imageTypeArr);
    }

    public static InterfaceC2979a getEntries() {
        return f19633c;
    }

    public static ImageType valueOf(String str) {
        return (ImageType) Enum.valueOf(ImageType.class, str);
    }

    public static ImageType[] values() {
        return (ImageType[]) b.clone();
    }
}
