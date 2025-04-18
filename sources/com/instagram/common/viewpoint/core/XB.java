package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* loaded from: assets/audience_network.dex */
public abstract class XB extends AbstractC0559Go {
    public static String[] A01 = {"345", "FfDXMYzxXX", "vOpcwtbjBUDLg7W", "vwl6", "8z1", "veIKYNosptAQN6qLcG3", "gZDMPK8cRuT1y1gEfTueAQyhJzVpTsF6", "gXo"};
    public C0554Gj A00;

    public abstract Pair<AG[], InterfaceC0556Gl[]> A0V(C0554Gj c0554Gj, int[][][] iArr, int[] iArr2) throws C03909h;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A0Q(com.instagram.common.viewpoint.core.AF[] r6, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r7) throws com.instagram.common.viewpoint.core.C03909h {
        /*
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L3:
            int r0 = r6.length
            if (r3 >= r0) goto L25
            r2 = r6[r3]
            r1 = 0
        L9:
            int r0 = r7.A01
            if (r1 >= r0) goto L22
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r7.A01(r1)
            int r0 = r2.AH6(r0)
            r0 = r0 & 7
            if (r0 <= r4) goto L1f
            r5 = r3
            r4 = r0
            r0 = 4
            if (r4 != r0) goto L1f
            return r5
        L1f:
            int r1 = r1 + 1
            goto L9
        L22:
            int r3 = r3 + 1
            goto L3
        L25:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.XB.A0Q(com.facebook.ads.redexgen.X.AF[], com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup):int");
    }

    public static int[] A0R(AF af, TrackGroup trackGroup) throws C03909h {
        int[] iArr = new int[trackGroup.A01];
        for (int i2 = 0; i2 < trackGroup.A01; i2++) {
            iArr[i2] = af.AH6(trackGroup.A01(i2));
        }
        return iArr;
    }

    public static int[] A0S(AF[] afArr) throws C03909h {
        int[] iArr = new int[afArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = afArr[i2].AH8();
        }
        return iArr;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0559Go
    public final C0560Gp A0T(AF[] afArr, TrackGroupArray trackGroupArray) throws C03909h {
        int[] A0R;
        int[] iArr = new int[afArr.length + 1];
        TrackGroup[][] rendererTrackGroups = new TrackGroup[afArr.length + 1];
        int[][][] iArr2 = new int[afArr.length + 1][];
        for (int i2 = 0; i2 < rendererTrackGroups.length; i2++) {
            rendererTrackGroups[i2] = new TrackGroup[trackGroupArray.A01];
            iArr2[i2] = new int[trackGroupArray.A01];
        }
        int[] A0S = A0S(afArr);
        for (int rendererIndex = 0; rendererIndex < trackGroupArray.A01; rendererIndex++) {
            TrackGroup group = trackGroupArray.A01(rendererIndex);
            int groupIndex = A0Q(afArr, group);
            if (groupIndex == afArr.length) {
                int i3 = group.A01;
                if (A01[1].length() == 20) {
                    throw new RuntimeException();
                }
                A01[1] = "Qr8HrRU9lFqgPA0W8kPuONAnzw";
                A0R = new int[i3];
            } else {
                AF af = afArr[groupIndex];
                String[] strArr = A01;
                if (strArr[7].length() != strArr[4].length()) {
                    A0R = A0R(af, group);
                } else {
                    A01[6] = "EvETe5B0Bd5mG8cCaH8U5OecDBUSnDnc";
                    A0R = A0R(af, group);
                }
            }
            int i4 = iArr[groupIndex];
            rendererTrackGroups[groupIndex][i4] = group;
            iArr2[groupIndex][i4] = A0R;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[afArr.length];
        int[] iArr3 = new int[afArr.length];
        for (int i5 = 0; i5 < afArr.length; i5++) {
            int i6 = iArr[i5];
            trackGroupArrayArr[i5] = new TrackGroupArray((TrackGroup[]) IK.A0k(rendererTrackGroups[i5], i6));
            iArr2[i5] = (int[][]) IK.A0k(iArr2[i5], i6);
            iArr3[i5] = afArr[i5].A8a();
        }
        C0554Gj c0554Gj = new C0554Gj(iArr3, trackGroupArrayArr, A0S, iArr2, new TrackGroupArray((TrackGroup[]) IK.A0k(rendererTrackGroups[afArr.length], iArr[afArr.length])));
        Pair<AG[], InterfaceC0556Gl[]> A0V = A0V(c0554Gj, iArr2, A0S);
        return new C0560Gp((AG[]) A0V.first, (InterfaceC0556Gl[]) A0V.second, c0554Gj);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0559Go
    public final void A0U(Object obj) {
        this.A00 = (C0554Gj) obj;
    }
}
