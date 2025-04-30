package u4;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2761f {
    public static final EnumC2761f b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f23116c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC2761f[] f23117d;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2761f EF10;

    /* JADX WARN: Type inference failed for: r10v0, types: [u4.f, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [u4.f, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [u4.f, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [u4.f, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [u4.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v1, types: [u4.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [u4.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [u4.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v0, types: [u4.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v0, types: [u4.f, java.lang.Enum] */
    static {
        ?? r10 = new Enum("X86_32", 0);
        ?? r12 = new Enum("X86_64", 1);
        ?? r22 = new Enum("ARM_UNKNOWN", 2);
        ?? r32 = new Enum("PPC", 3);
        ?? r42 = new Enum("PPC64", 4);
        ?? r122 = new Enum("ARMV6", 5);
        ?? r13 = new Enum("ARMV7", 6);
        ?? r72 = new Enum("UNKNOWN", 7);
        b = r72;
        ?? r82 = new Enum("ARMV7S", 8);
        ?? r14 = new Enum("ARM64", 9);
        f23117d = new EnumC2761f[]{r10, r12, r22, r32, r42, r122, r13, r72, r82, r14};
        HashMap hashMap = new HashMap(4);
        f23116c = hashMap;
        hashMap.put("armeabi-v7a", r13);
        hashMap.put("armeabi", r122);
        hashMap.put("arm64-v8a", r14);
        hashMap.put("x86", r10);
    }

    public static EnumC2761f valueOf(String str) {
        return (EnumC2761f) Enum.valueOf(EnumC2761f.class, str);
    }

    public static EnumC2761f[] values() {
        return (EnumC2761f[]) f23117d.clone();
    }
}
