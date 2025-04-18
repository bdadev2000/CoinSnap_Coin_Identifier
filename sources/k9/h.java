package k9;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.location.GeofenceStatusCodes;
import n9.h0;

/* loaded from: classes3.dex */
public final class h extends w {
    public static final /* synthetic */ int S = 0;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    static {
        new h(new g());
        h0.E(1000);
        h0.E(1001);
        h0.E(1002);
        h0.E(1003);
        h0.E(1004);
        h0.E(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
        h0.E(1006);
        h0.E(1007);
        h0.E(1008);
        h0.E(1009);
        h0.E(1010);
        h0.E(1011);
        h0.E(1012);
        h0.E(1013);
        h0.E(1014);
        h0.E(1015);
        h0.E(1016);
        h0.E(1017);
    }

    public h(g gVar) {
        super(gVar);
        this.C = gVar.f20424w;
        this.D = gVar.f20425x;
        this.E = gVar.f20426y;
        this.F = gVar.f20427z;
        this.G = gVar.A;
        this.H = gVar.B;
        this.I = gVar.C;
        this.J = gVar.D;
        this.K = gVar.E;
        this.L = gVar.F;
        this.M = gVar.G;
        this.N = gVar.H;
        this.O = gVar.I;
        this.P = gVar.J;
        this.Q = gVar.K;
        this.R = gVar.L;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9 A[LOOP:0: B:49:0x00a2->B:67:0x00f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009f A[SYNTHETIC] */
    @Override // k9.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.h.equals(java.lang.Object):boolean");
    }

    @Override // k9.w
    public final int hashCode() {
        return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0);
    }
}
