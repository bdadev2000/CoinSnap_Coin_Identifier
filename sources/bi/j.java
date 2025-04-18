package bi;

import java.net.Proxy;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        iArr[Proxy.Type.HTTP.ordinal()] = 2;
        a = iArr;
    }
}
