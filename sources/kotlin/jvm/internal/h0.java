package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public final class h0 {
    public static String a(m mVar) {
        String obj = mVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
