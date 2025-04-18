package androidx.navigation.serialization;

import k1.a;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes2.dex */
public final class RouteBuilder<T> {

    /* renamed from: a, reason: collision with root package name */
    public final a f20780a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20781b;

    /* renamed from: c, reason: collision with root package name */
    public String f20782c = "";
    public String d = "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class ParamType {

        /* renamed from: a, reason: collision with root package name */
        public static final ParamType f20783a;

        /* renamed from: b, reason: collision with root package name */
        public static final ParamType f20784b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ParamType[] f20785c;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.navigation.serialization.RouteBuilder$ParamType] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.navigation.serialization.RouteBuilder$ParamType] */
        static {
            ?? r02 = new Enum("PATH", 0);
            f20783a = r02;
            ?? r1 = new Enum("QUERY", 1);
            f20784b = r1;
            f20785c = new ParamType[]{r02, r1};
        }

        public static ParamType valueOf(String str) {
            return (ParamType) Enum.valueOf(ParamType.class, str);
        }

        public static ParamType[] values() {
            return (ParamType[]) f20785c.clone();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ParamType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RouteBuilder(a aVar) {
        this.f20780a = aVar;
        this.f20781b = aVar.b().g();
    }

    public final void a(String str, String str2) {
        this.d += (this.d.length() == 0 ? "?" : "&") + str + SignatureVisitor.INSTANCEOF + str2;
    }
}
