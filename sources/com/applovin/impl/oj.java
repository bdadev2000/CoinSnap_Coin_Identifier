package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.qi;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public class oj implements Comparable {
    public static final oj A;
    public static final oj A0;
    public static final oj A1;
    public static final oj A2;
    public static final oj A3;
    public static final oj A4;
    public static final oj A5;
    public static final oj A6;
    public static final oj B;
    public static final oj B0;
    public static final oj B1;
    public static final oj B2;
    public static final oj B3;
    public static final oj B4;
    public static final oj B5;
    public static final oj B6;
    public static final oj C;
    public static final oj C0;
    public static final oj C1;
    public static final oj C2;
    public static final oj C3;
    public static final oj C4;
    public static final oj C5;
    public static final oj C6;
    public static final oj D;
    public static final oj D0;
    public static final oj D1;
    public static final oj D2;
    public static final oj D3;
    public static final oj D4;
    public static final oj D5;
    public static final oj D6;
    public static final oj E;
    public static final oj E0;
    public static final oj E1;
    public static final oj E2;
    public static final oj E3;
    public static final oj E4;
    public static final oj E5;
    public static final oj E6;
    public static final oj F;
    public static final oj F0;
    public static final oj F1;
    public static final oj F2;
    public static final oj F3;
    public static final oj F4;
    public static final oj F5;
    public static final oj F6;
    public static final oj G;
    public static final oj G0;
    public static final oj G1;
    public static final oj G2;
    public static final oj G3;
    public static final oj G4;
    public static final oj G5;
    public static final oj H;
    public static final oj H0;
    public static final oj H1;
    public static final oj H2;
    public static final oj H3;
    public static final oj H4;
    public static final oj H5;
    public static final oj I;
    public static final oj I0;
    public static final oj I1;
    public static final oj I2;
    public static final oj I3;
    public static final oj I4;
    public static final oj I5;
    public static final oj J;
    public static final oj J0;
    public static final oj J1;
    public static final oj J2;
    public static final oj J3;
    public static final oj J4;
    public static final oj J5;
    public static final oj K;
    public static final oj K0;
    public static final oj K1;
    public static final oj K2;
    public static final oj K3;
    public static final oj K4;
    public static final oj K5;
    public static final oj L;
    public static final oj L0;
    public static final oj L1;
    public static final oj L2;
    public static final oj L3;
    public static final oj L4;
    public static final oj L5;
    public static final oj M;
    public static final oj M0;
    public static final oj M1;
    public static final oj M2;
    public static final oj M3;
    public static final oj M4;
    public static final oj M5;
    public static final oj N;
    public static final oj N0;
    public static final oj N1;
    public static final oj N2;
    public static final oj N3;
    public static final oj N4;
    public static final oj N5;
    public static final oj O;
    public static final oj O0;
    public static final oj O1;
    public static final oj O2;
    public static final oj O3;
    public static final oj O4;
    public static final oj O5;
    public static final oj P;
    public static final oj P0;
    public static final oj P1;
    public static final oj P2;
    public static final oj P3;
    public static final oj P4;
    public static final oj P5;
    public static final oj Q;
    public static final oj Q0;
    public static final oj Q1;
    public static final oj Q2;
    public static final oj Q3;
    public static final oj Q4;
    public static final oj Q5;
    public static final oj R;
    public static final oj R0;
    public static final oj R1;
    public static final oj R2;
    public static final oj R3;
    public static final oj R4;
    public static final oj R5;
    public static final oj S;
    public static final oj S0;
    public static final oj S1;
    public static final oj S2;
    public static final oj S3;
    public static final oj S4;
    public static final oj S5;
    public static final oj T;
    public static final oj T0;
    public static final oj T1;
    public static final oj T2;
    public static final oj T3;
    public static final oj T4;
    public static final oj T5;
    public static final oj U;
    public static final oj U0;
    public static final oj U1;
    public static final oj U2;
    public static final oj U3;
    public static final oj U4;
    public static final oj U5;
    public static final oj V;
    public static final oj V0;
    public static final oj V1;
    public static final oj V2;
    public static final oj V3;
    public static final oj V4;
    public static final oj V5;
    public static final oj W;
    public static final oj W0;
    public static final oj W1;
    public static final oj W2;
    public static final oj W3;
    public static final oj W4;
    public static final oj W5;
    public static final oj X;
    public static final oj X0;
    public static final oj X1;
    public static final oj X2;
    public static final oj X3;
    public static final oj X4;
    public static final oj X5;
    public static final oj Y;
    public static final oj Y0;
    public static final oj Y1;
    public static final oj Y2;
    public static final oj Y3;
    public static final oj Y4;
    public static final oj Y5;
    public static final oj Z;
    public static final oj Z0;
    public static final oj Z1;
    public static final oj Z2;
    public static final oj Z3;
    public static final oj Z4;
    public static final oj Z5;

    /* renamed from: a0, reason: collision with root package name */
    public static final oj f6613a0;

    /* renamed from: a1, reason: collision with root package name */
    public static final oj f6614a1;

    /* renamed from: a2, reason: collision with root package name */
    public static final oj f6615a2;

    /* renamed from: a3, reason: collision with root package name */
    public static final oj f6616a3;

    /* renamed from: a4, reason: collision with root package name */
    public static final oj f6617a4;

    /* renamed from: a5, reason: collision with root package name */
    public static final oj f6618a5;

    /* renamed from: a6, reason: collision with root package name */
    public static final oj f6619a6;

    /* renamed from: b0, reason: collision with root package name */
    public static final oj f6620b0;

    /* renamed from: b1, reason: collision with root package name */
    public static final oj f6621b1;

    /* renamed from: b2, reason: collision with root package name */
    public static final oj f6622b2;
    public static final oj b3;

    /* renamed from: b4, reason: collision with root package name */
    public static final oj f6623b4;

    /* renamed from: b5, reason: collision with root package name */
    public static final oj f6624b5;

    /* renamed from: b6, reason: collision with root package name */
    public static final oj f6625b6;

    /* renamed from: c0, reason: collision with root package name */
    public static final oj f6627c0;

    /* renamed from: c1, reason: collision with root package name */
    public static final oj f6628c1;

    /* renamed from: c2, reason: collision with root package name */
    public static final oj f6629c2;

    /* renamed from: c3, reason: collision with root package name */
    public static final oj f6630c3;

    /* renamed from: c4, reason: collision with root package name */
    public static final oj f6631c4;

    /* renamed from: c5, reason: collision with root package name */
    public static final oj f6632c5;

    /* renamed from: c6, reason: collision with root package name */
    public static final oj f6633c6;

    /* renamed from: d0, reason: collision with root package name */
    public static final oj f6635d0;

    /* renamed from: d1, reason: collision with root package name */
    public static final oj f6636d1;

    /* renamed from: d2, reason: collision with root package name */
    public static final oj f6637d2;

    /* renamed from: d3, reason: collision with root package name */
    public static final oj f6638d3;

    /* renamed from: d4, reason: collision with root package name */
    public static final oj f6639d4;

    /* renamed from: d5, reason: collision with root package name */
    public static final oj f6640d5;

    /* renamed from: d6, reason: collision with root package name */
    public static final oj f6641d6;

    /* renamed from: e0, reason: collision with root package name */
    public static final oj f6642e0;

    /* renamed from: e1, reason: collision with root package name */
    public static final oj f6643e1;
    public static final oj e2;

    /* renamed from: e3, reason: collision with root package name */
    public static final oj f6644e3;

    /* renamed from: e4, reason: collision with root package name */
    public static final oj f6645e4;

    /* renamed from: e5, reason: collision with root package name */
    public static final oj f6646e5;

    /* renamed from: e6, reason: collision with root package name */
    public static final oj f6647e6;

    /* renamed from: f, reason: collision with root package name */
    public static final oj f6648f;

    /* renamed from: f0, reason: collision with root package name */
    public static final oj f6649f0;

    /* renamed from: f1, reason: collision with root package name */
    public static final oj f6650f1;

    /* renamed from: f2, reason: collision with root package name */
    public static final oj f6651f2;

    /* renamed from: f3, reason: collision with root package name */
    public static final oj f6652f3;

    /* renamed from: f4, reason: collision with root package name */
    public static final oj f6653f4;

    /* renamed from: f5, reason: collision with root package name */
    public static final oj f6654f5;

    /* renamed from: f6, reason: collision with root package name */
    public static final oj f6655f6;

    /* renamed from: g, reason: collision with root package name */
    public static final oj f6656g;

    /* renamed from: g0, reason: collision with root package name */
    public static final oj f6657g0;

    /* renamed from: g1, reason: collision with root package name */
    public static final oj f6658g1;

    /* renamed from: g2, reason: collision with root package name */
    public static final oj f6659g2;

    /* renamed from: g3, reason: collision with root package name */
    public static final oj f6660g3;

    /* renamed from: g4, reason: collision with root package name */
    public static final oj f6661g4;

    /* renamed from: g5, reason: collision with root package name */
    public static final oj f6662g5;

    /* renamed from: g6, reason: collision with root package name */
    public static final oj f6663g6;

    /* renamed from: h, reason: collision with root package name */
    public static final oj f6664h;

    /* renamed from: h0, reason: collision with root package name */
    public static final oj f6665h0;

    /* renamed from: h1, reason: collision with root package name */
    public static final oj f6666h1;

    /* renamed from: h2, reason: collision with root package name */
    public static final oj f6667h2;

    /* renamed from: h3, reason: collision with root package name */
    public static final oj f6668h3;

    /* renamed from: h4, reason: collision with root package name */
    public static final oj f6669h4;

    /* renamed from: h5, reason: collision with root package name */
    public static final oj f6670h5;

    /* renamed from: h6, reason: collision with root package name */
    public static final oj f6671h6;

    /* renamed from: i, reason: collision with root package name */
    public static final oj f6672i;

    /* renamed from: i0, reason: collision with root package name */
    public static final oj f6673i0;

    /* renamed from: i1, reason: collision with root package name */
    public static final oj f6674i1;

    /* renamed from: i2, reason: collision with root package name */
    public static final oj f6675i2;

    /* renamed from: i3, reason: collision with root package name */
    public static final oj f6676i3;

    /* renamed from: i4, reason: collision with root package name */
    public static final oj f6677i4;

    /* renamed from: i5, reason: collision with root package name */
    public static final oj f6678i5;

    /* renamed from: i6, reason: collision with root package name */
    public static final oj f6679i6;

    /* renamed from: j, reason: collision with root package name */
    public static final oj f6680j;

    /* renamed from: j0, reason: collision with root package name */
    public static final oj f6681j0;

    /* renamed from: j1, reason: collision with root package name */
    public static final oj f6682j1;

    /* renamed from: j2, reason: collision with root package name */
    public static final oj f6683j2;
    public static final oj j3;

    /* renamed from: j4, reason: collision with root package name */
    public static final oj f6684j4;

    /* renamed from: j5, reason: collision with root package name */
    public static final oj f6685j5;

    /* renamed from: j6, reason: collision with root package name */
    public static final oj f6686j6;

    /* renamed from: k, reason: collision with root package name */
    public static final oj f6687k;

    /* renamed from: k0, reason: collision with root package name */
    public static final oj f6688k0;

    /* renamed from: k1, reason: collision with root package name */
    public static final oj f6689k1;

    /* renamed from: k2, reason: collision with root package name */
    public static final oj f6690k2;

    /* renamed from: k3, reason: collision with root package name */
    public static final oj f6691k3;

    /* renamed from: k4, reason: collision with root package name */
    public static final oj f6692k4;

    /* renamed from: k5, reason: collision with root package name */
    public static final oj f6693k5;

    /* renamed from: k6, reason: collision with root package name */
    public static final oj f6694k6;

    /* renamed from: l, reason: collision with root package name */
    public static final oj f6695l;

    /* renamed from: l0, reason: collision with root package name */
    public static final oj f6696l0;

    /* renamed from: l1, reason: collision with root package name */
    public static final oj f6697l1;

    /* renamed from: l2, reason: collision with root package name */
    public static final oj f6698l2;

    /* renamed from: l3, reason: collision with root package name */
    public static final oj f6699l3;

    /* renamed from: l4, reason: collision with root package name */
    public static final oj f6700l4;

    /* renamed from: l5, reason: collision with root package name */
    public static final oj f6701l5;

    /* renamed from: l6, reason: collision with root package name */
    public static final oj f6702l6;

    /* renamed from: m, reason: collision with root package name */
    public static final oj f6703m;

    /* renamed from: m0, reason: collision with root package name */
    public static final oj f6704m0;

    /* renamed from: m1, reason: collision with root package name */
    public static final oj f6705m1;

    /* renamed from: m2, reason: collision with root package name */
    public static final oj f6706m2;

    /* renamed from: m3, reason: collision with root package name */
    public static final oj f6707m3;

    /* renamed from: m4, reason: collision with root package name */
    public static final oj f6708m4;

    /* renamed from: m5, reason: collision with root package name */
    public static final oj f6709m5;

    /* renamed from: m6, reason: collision with root package name */
    public static final oj f6710m6;

    /* renamed from: n, reason: collision with root package name */
    public static final oj f6711n;

    /* renamed from: n0, reason: collision with root package name */
    public static final oj f6712n0;

    /* renamed from: n1, reason: collision with root package name */
    public static final oj f6713n1;

    /* renamed from: n2, reason: collision with root package name */
    public static final oj f6714n2;

    /* renamed from: n3, reason: collision with root package name */
    public static final oj f6715n3;

    /* renamed from: n4, reason: collision with root package name */
    public static final oj f6716n4;

    /* renamed from: n5, reason: collision with root package name */
    public static final oj f6717n5;

    /* renamed from: n6, reason: collision with root package name */
    public static final oj f6718n6;

    /* renamed from: o, reason: collision with root package name */
    public static final oj f6719o;

    /* renamed from: o0, reason: collision with root package name */
    public static final oj f6720o0;

    /* renamed from: o1, reason: collision with root package name */
    public static final oj f6721o1;

    /* renamed from: o2, reason: collision with root package name */
    public static final oj f6722o2;

    /* renamed from: o3, reason: collision with root package name */
    public static final oj f6723o3;

    /* renamed from: o4, reason: collision with root package name */
    public static final oj f6724o4;

    /* renamed from: o5, reason: collision with root package name */
    public static final oj f6725o5;

    /* renamed from: o6, reason: collision with root package name */
    public static final oj f6726o6;

    /* renamed from: p, reason: collision with root package name */
    public static final oj f6727p;

    /* renamed from: p0, reason: collision with root package name */
    public static final oj f6728p0;

    /* renamed from: p1, reason: collision with root package name */
    public static final oj f6729p1;

    /* renamed from: p2, reason: collision with root package name */
    public static final oj f6730p2;

    /* renamed from: p3, reason: collision with root package name */
    public static final oj f6731p3;

    /* renamed from: p4, reason: collision with root package name */
    public static final oj f6732p4;

    /* renamed from: p5, reason: collision with root package name */
    public static final oj f6733p5;

    /* renamed from: p6, reason: collision with root package name */
    public static final oj f6734p6;

    /* renamed from: q, reason: collision with root package name */
    public static final oj f6735q;

    /* renamed from: q0, reason: collision with root package name */
    public static final oj f6736q0;

    /* renamed from: q1, reason: collision with root package name */
    public static final oj f6737q1;

    /* renamed from: q2, reason: collision with root package name */
    public static final oj f6738q2;

    /* renamed from: q3, reason: collision with root package name */
    public static final oj f6739q3;

    /* renamed from: q4, reason: collision with root package name */
    public static final oj f6740q4;

    /* renamed from: q5, reason: collision with root package name */
    public static final oj f6741q5;

    /* renamed from: q6, reason: collision with root package name */
    public static final oj f6742q6;

    /* renamed from: r, reason: collision with root package name */
    public static final oj f6743r;

    /* renamed from: r0, reason: collision with root package name */
    public static final oj f6744r0;

    /* renamed from: r1, reason: collision with root package name */
    public static final oj f6745r1;

    /* renamed from: r2, reason: collision with root package name */
    public static final oj f6746r2;

    /* renamed from: r3, reason: collision with root package name */
    public static final oj f6747r3;

    /* renamed from: r4, reason: collision with root package name */
    public static final oj f6748r4;

    /* renamed from: r5, reason: collision with root package name */
    public static final oj f6749r5;
    public static final oj r6;

    /* renamed from: s, reason: collision with root package name */
    public static final oj f6750s;

    /* renamed from: s0, reason: collision with root package name */
    public static final oj f6751s0;

    /* renamed from: s1, reason: collision with root package name */
    public static final oj f6752s1;

    /* renamed from: s2, reason: collision with root package name */
    public static final oj f6753s2;

    /* renamed from: s3, reason: collision with root package name */
    public static final oj f6754s3;

    /* renamed from: s4, reason: collision with root package name */
    public static final oj f6755s4;
    public static final oj s5;

    /* renamed from: s6, reason: collision with root package name */
    public static final oj f6756s6;

    /* renamed from: t, reason: collision with root package name */
    public static final oj f6757t;

    /* renamed from: t0, reason: collision with root package name */
    public static final oj f6758t0;

    /* renamed from: t1, reason: collision with root package name */
    public static final oj f6759t1;

    /* renamed from: t2, reason: collision with root package name */
    public static final oj f6760t2;

    /* renamed from: t3, reason: collision with root package name */
    public static final oj f6761t3;

    /* renamed from: t4, reason: collision with root package name */
    public static final oj f6762t4;
    public static final oj t5;

    /* renamed from: t6, reason: collision with root package name */
    public static final oj f6763t6;
    public static final oj u;

    /* renamed from: u0, reason: collision with root package name */
    public static final oj f6764u0;

    /* renamed from: u1, reason: collision with root package name */
    public static final oj f6765u1;

    /* renamed from: u2, reason: collision with root package name */
    public static final oj f6766u2;

    /* renamed from: u3, reason: collision with root package name */
    public static final oj f6767u3;
    public static final oj u4;

    /* renamed from: u5, reason: collision with root package name */
    public static final oj f6768u5;

    /* renamed from: u6, reason: collision with root package name */
    public static final oj f6769u6;

    /* renamed from: v, reason: collision with root package name */
    public static final oj f6770v;

    /* renamed from: v0, reason: collision with root package name */
    public static final oj f6771v0;

    /* renamed from: v1, reason: collision with root package name */
    public static final oj f6772v1;

    /* renamed from: v2, reason: collision with root package name */
    public static final oj f6773v2;

    /* renamed from: v3, reason: collision with root package name */
    public static final oj f6774v3;

    /* renamed from: v4, reason: collision with root package name */
    public static final oj f6775v4;

    /* renamed from: v5, reason: collision with root package name */
    public static final oj f6776v5;

    /* renamed from: v6, reason: collision with root package name */
    public static final oj f6777v6;

    /* renamed from: w, reason: collision with root package name */
    public static final oj f6778w;

    /* renamed from: w0, reason: collision with root package name */
    public static final oj f6779w0;

    /* renamed from: w1, reason: collision with root package name */
    public static final oj f6780w1;

    /* renamed from: w2, reason: collision with root package name */
    public static final oj f6781w2;

    /* renamed from: w3, reason: collision with root package name */
    public static final oj f6782w3;

    /* renamed from: w4, reason: collision with root package name */
    public static final oj f6783w4;

    /* renamed from: w5, reason: collision with root package name */
    public static final oj f6784w5;

    /* renamed from: w6, reason: collision with root package name */
    public static final oj f6785w6;

    /* renamed from: x, reason: collision with root package name */
    public static final oj f6786x;

    /* renamed from: x0, reason: collision with root package name */
    public static final oj f6787x0;

    /* renamed from: x1, reason: collision with root package name */
    public static final oj f6788x1;

    /* renamed from: x2, reason: collision with root package name */
    public static final oj f6789x2;

    /* renamed from: x3, reason: collision with root package name */
    public static final oj f6790x3;

    /* renamed from: x4, reason: collision with root package name */
    public static final oj f6791x4;

    /* renamed from: x5, reason: collision with root package name */
    public static final oj f6792x5;

    /* renamed from: x6, reason: collision with root package name */
    public static final oj f6793x6;

    /* renamed from: y, reason: collision with root package name */
    public static final oj f6794y;

    /* renamed from: y0, reason: collision with root package name */
    public static final oj f6795y0;

    /* renamed from: y1, reason: collision with root package name */
    public static final oj f6796y1;

    /* renamed from: y2, reason: collision with root package name */
    public static final oj f6797y2;

    /* renamed from: y3, reason: collision with root package name */
    public static final oj f6798y3;
    public static final oj y4;

    /* renamed from: y5, reason: collision with root package name */
    public static final oj f6799y5;

    /* renamed from: y6, reason: collision with root package name */
    public static final oj f6800y6;

    /* renamed from: z, reason: collision with root package name */
    public static final oj f6801z;

    /* renamed from: z0, reason: collision with root package name */
    public static final oj f6802z0;

    /* renamed from: z1, reason: collision with root package name */
    public static final oj f6803z1;

    /* renamed from: z2, reason: collision with root package name */
    public static final oj f6804z2;

    /* renamed from: z3, reason: collision with root package name */
    public static final oj f6805z3;

    /* renamed from: z4, reason: collision with root package name */
    public static final oj f6806z4;

    /* renamed from: z5, reason: collision with root package name */
    public static final oj f6807z5;

    /* renamed from: z6, reason: collision with root package name */
    public static final oj f6808z6;
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6809b;

    /* renamed from: c, reason: collision with root package name */
    private static final List f6626c = Arrays.asList(Boolean.class, Float.class, Integer.class, Long.class, String.class);

    /* renamed from: d, reason: collision with root package name */
    private static final Map f6634d = new HashMap(512);

    static {
        Boolean bool = Boolean.FALSE;
        f6648f = a("is_disabled", bool);
        f6656g = a("device_id", "");
        Boolean bool2 = Boolean.TRUE;
        f6664h = a("rss", bool2);
        f6672i = a("rssoitf", bool);
        f6680j = a("cpoitf", bool);
        f6687k = a("device_token", "");
        f6695l = a("is_verbose_logging", bool);
        f6703m = a("error_reporter_v1_sample_percent", 100);
        f6711n = a("error_reporter_v2", bool);
        f6719o = a("error_reporter_v2_sample_percent", 1);
        f6727p = a("error_reporter_v2_endpoint", "https://docs.applovin.com/1.0/sdk/event");
        f6735q = a("sc", "");
        f6743r = a("sc2", "");
        f6750s = a("sc3", "");
        f6757t = a("server_installed_at", "");
        u = a("pnrc", bool);
        f6770v = a("clear_completion_callback_on_failure", bool);
        f6778w = a("sicd_ms", 0L);
        f6786x = a("logcat_max_line_size", 1000);
        f6794y = a("exception_handler_enabled", bool2);
        f6801z = a("aei", -1);
        A = a("mei", -1);
        B = a("md", "");
        C = a("bdae", bool);
        D = a("tewllm", bool2);
        E = a("tewplosda", bool2);
        F = a("srwbe", bool);
        G = a("malaera", -1);
        H = a("eralaf", "");
        I = a("eraziie", bool);
        J = a("ps_atu", "");
        K = a("lsu", bool);
        L = a("tla_ms", -1L);
        M = a("stwr", bool);
        N = a("uactlac", bool);
        O = a("stps", 2);
        P = a("auxiliary_operations_threads", 1);
        Q = a("apsobt", bool2);
        R = a("tmtp", 1);
        S = a("network_thread_count", 2);
        T = a("ntp", 5);
        U = a("ueq", bool);
        V = a("coretc", 1);
        W = a("cachetc", 1);
        X = a("mtc", 1);
        Y = a("ttc", 1);
        Z = a("otc", 1);
        f6613a0 = a("uaeq", bool);
        f6620b0 = a("ah_cvc", bool2);
        f6627c0 = a("ah_cdde", bool2);
        f6635d0 = a("ah_crut", bool2);
        f6642e0 = a("init_omsdk", bool2);
        f6649f0 = a("omsdk_partner_name", "applovin");
        f6657g0 = a("publisher_can_show_consent_dialog", bool2);
        f6665h0 = a("consent_dialog_url", "https://assets.applovin.com/gdpr/flow_v1/gdpr-flow-1.html");
        f6673i0 = a("consent_dialog_immersive_mode_on", bool);
        f6681j0 = a("consent_dialog_show_from_alert_delay_ms", 450L);
        f6688k0 = a("alert_consent_for_dialog_rejected", bool);
        f6696l0 = a("alert_consent_for_dialog_closed", bool);
        f6704m0 = a("alert_consent_for_dialog_closed_with_back_button", bool);
        f6712n0 = a("alert_consent_after_init", bool);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f6720o0 = com.applovin.impl.mediation.ads.e.b(timeUnit, 5L, "alert_consent_after_init_interval_ms");
        f6728p0 = com.applovin.impl.mediation.ads.e.b(timeUnit, 30L, "alert_consent_after_dialog_rejection_interval_ms");
        f6736q0 = com.applovin.impl.mediation.ads.e.b(timeUnit, 5L, "alert_consent_after_dialog_close_interval_ms");
        f6744r0 = com.applovin.impl.mediation.ads.e.b(timeUnit, 5L, "alert_consent_after_dialog_close_with_back_button_interval_ms");
        f6751s0 = com.applovin.impl.mediation.ads.e.b(timeUnit, 10L, "alert_consent_after_cancel_interval_ms");
        f6758t0 = com.applovin.impl.mediation.ads.e.b(timeUnit, 5L, "alert_consent_reschedule_interval_ms");
        f6764u0 = a("text_alert_consent_title", "Make this App Better and Stay Free!");
        f6771v0 = a("text_alert_consent_body", "If you don't give us consent to use your data, you will be making our ability to support this app harder, which may negatively affect the user experience.");
        f6779w0 = a("text_alert_consent_yes_option", "I Agree");
        f6787x0 = a("text_alert_consent_no_option", "Cancel");
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        f6795y0 = com.applovin.impl.mediation.ads.e.b(timeUnit2, 1L, "ttc_max_click_duration_ms");
        f6802z0 = a("ttc_max_click_distance_dp", 10);
        AppLovinTouchToClickListener.ClickRecognitionState clickRecognitionState = AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN;
        A0 = a("ttc_acrsv2a", Integer.valueOf(clickRecognitionState.ordinal()));
        B0 = a("ttc_acrsnv", Integer.valueOf(clickRecognitionState.ordinal()));
        C0 = a("ttc_acrsa", Integer.valueOf(clickRecognitionState.ordinal()));
        D0 = a("ttc_acrsn", Integer.valueOf(clickRecognitionState.ordinal()));
        E0 = a("ttc_edge_buffer_dp", 0);
        F0 = a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
        G0 = a("fetch_settings_endpoint", "https://ms.applovin.com/");
        H0 = a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
        I0 = a("adserver_endpoint", "https://a.applovin.com/");
        J0 = a("adserver_backup_endpoint", "https://a.applvn.com/");
        K0 = a("api_endpoint", "https://d.applovin.com/");
        L0 = a("api_backup_endpoint", "https://d.applvn.com/");
        M0 = a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
        N0 = a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
        O0 = a("token_type_prefixes_r", "4!");
        P0 = a("token_type_prefixes_arj", "json_v3!");
        Q0 = a("top_level_events", "landing,paused,resumed,cf_start,tos_ok,gdpr_ok,ref,rdf,checkout,iap");
        R0 = a("valid_super_property_types", String.class.getName() + "," + Integer.class.getName() + "," + Long.class.getName() + "," + Double.class.getName() + "," + Float.class.getName() + "," + Date.class.getName() + "," + Uri.class.getName() + "," + List.class.getName() + "," + Map.class.getName());
        S0 = a("persist_super_properties", bool2);
        T0 = a("super_property_string_max_length", Integer.valueOf(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY));
        U0 = a("super_property_url_max_length", Integer.valueOf(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY));
        TimeUnit timeUnit3 = TimeUnit.DAYS;
        V0 = a("cache_file_ttl_seconds", Long.valueOf(timeUnit3.toSeconds(1L)));
        W0 = a("cache_max_size_mb", -1);
        X0 = a("precache_delimiters", ")]', ");
        Y0 = a("ad_resource_caching_enabled", bool2);
        Z0 = a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");
        f6614a1 = a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");
        f6621b1 = a("resource_max_filename_length", 255);
        f6628c1 = a("ccrc", bool);
        f6636d1 = a("mcct", 3);
        f6643e1 = a("mchct", 3);
        f6650f1 = a("dficf", bool);
        f6658g1 = a("dfirf", bool);
        f6666h1 = a("dfipf", bool);
        f6674i1 = a("decr", bool);
        f6682j1 = a("dcrome", bool);
        f6689k1 = a("dcrobs", bool);
        f6697l1 = a("lfeufc", bool);
        f6705m1 = a("pcro", bool);
        f6713n1 = a("efecobt", bool);
        f6721o1 = a("saewib", bool);
        f6729p1 = a("fsae_ms", -1L);
        f6737q1 = a("raae", bool);
        f6745r1 = a("vr_retry_count_v1", 1);
        f6752s1 = a("cr_retry_count_v1", 1);
        f6759t1 = a("text_incent_warning_title", "Attention!");
        f6765u1 = a("text_incent_warning_body", "You won’t get your reward if the video hasn’t finished.");
        f6772v1 = a("text_incent_warning_close_option", "Close");
        f6780w1 = a("text_incent_warning_continue_option", "Keep Watching");
        f6788x1 = a("text_incent_nonvideo_warning_title", "Attention!");
        f6796y1 = a("text_incent_nonvideo_warning_body", "You won’t get your reward if the game hasn’t finished.");
        f6803z1 = a("text_incent_nonvideo_warning_close_option", "Close");
        A1 = a("text_incent_nonvideo_warning_continue_option", "Keep Playing");
        B1 = a("close_button_touch_area", 0);
        C1 = a("close_button_outside_touch_area", 0);
        D1 = a("creative_debugger_enabled", bool2);
        E1 = a("smdfhcdb", bool2);
        F1 = a("adview_clearview", bool);
        G1 = a("ravip", bool);
        H1 = com.applovin.impl.mediation.ads.e.b(timeUnit2, 1L, "viewability_adview_imp_delay_ms");
        I1 = a("viewability_adview_banner_min_width", 320);
        J1 = a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        K1 = a("viewability_adview_mrec_min_width", Integer.valueOf(maxAdFormat.getSize().getWidth()));
        L1 = a("viewability_adview_mrec_min_height", Integer.valueOf(maxAdFormat.getSize().getHeight()));
        M1 = a("viewability_adview_leader_min_width", 728);
        N1 = a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
        O1 = a("viewability_adview_native_min_width", 0);
        P1 = a("viewability_adview_native_min_height", 0);
        Q1 = a("viewability_adview_min_alpha", Float.valueOf(10.0f));
        R1 = com.applovin.impl.mediation.ads.e.b(timeUnit2, 1L, "viewability_timer_min_visible_ms");
        S1 = a("viewability_timer_interval_ms", 100L);
        T1 = a("expandable_close_button_size", 27);
        U1 = a("expandable_h_close_button_margin", 10);
        V1 = a("expandable_t_close_button_margin", 10);
        W1 = a("expandable_lhs_close_button", bool);
        X1 = a("expandable_close_button_touch_area", 0);
        Y1 = a("iaad", bool);
        Z1 = a("js_tag_schemes", "applovin,mopub");
        f6615a2 = a("js_tag_load_success_hosts", "load,load_succeeded");
        f6622b2 = a("js_tag_load_failure_hosts", "failLoad,load_failed");
        f6629c2 = com.applovin.impl.mediation.ads.e.b(timeUnit2, 10L, "fullscreen_ad_pending_display_state_timeout_ms");
        f6637d2 = com.applovin.impl.mediation.ads.e.b(timeUnit, 2L, "fullscreen_ad_showing_state_timeout_ms");
        e2 = a("lhs_close_button_video", bool);
        f6651f2 = a("close_button_right_margin_video", 4);
        f6659g2 = a("close_button_size_video", 30);
        f6667h2 = a("close_button_top_margin_video", 8);
        f6675i2 = a("video_countdown_clock_margin", 10);
        f6683j2 = a("video_countdown_clock_gravity", 83);
        f6690k2 = a("countdown_clock_size", 32);
        f6698l2 = a("countdown_clock_stroke_size", 4);
        f6706m2 = a("countdown_clock_text_size", 28);
        f6714n2 = a("draw_countdown_clock", bool2);
        f6722o2 = a("inter_display_delay", 200L);
        f6730p2 = a("maximum_close_button_delay_seconds", 999L);
        f6738q2 = a("respect_close_button", bool2);
        f6746r2 = a("lhs_skip_button", bool2);
        f6753s2 = a("track_app_killed", bool);
        f6760t2 = com.applovin.impl.mediation.ads.e.b(timeUnit2, 60L, "app_closed_time_threshold_for_app_killed_event_ms");
        f6766u2 = a("mute_controls_enabled", bool);
        f6773v2 = a("allow_user_muting", bool2);
        f6781w2 = a("mute_videos", bool);
        f6789x2 = a("show_mute_by_default", bool);
        f6797y2 = a("mute_with_user_settings", bool2);
        f6804z2 = a("mute_button_size", 32);
        A2 = a("mute_button_margin", 10);
        B2 = a("mute_button_gravity", 85);
        C2 = a("progress_bar_step", 25L);
        D2 = a("progress_bar_scale", 10000);
        E2 = a("progress_bar_vertical_padding", -8);
        F2 = a("vs_buffer_indicator_size", 50);
        G2 = a("video_zero_length_as_computed", bool);
        H2 = a("set_poststitial_muted_initial_delay_ms", 500L);
        I2 = a("fasuic", bool2);
        J2 = a("fsahrpg", bool2);
        K2 = a("eaafrwsoa", bool2);
        L2 = a("postitial_progress_bar_step_ms", 25L);
        M2 = a("postitial_progress_bar_on_bottom", bool2);
        N2 = a("postitial_progress_bar_vertical_padding", -8);
        O2 = a("postitial_progress_bar_scale", 10000);
        P2 = a("fahosu", bool);
        Q2 = a("pause_fullscreen_ad_ui_when_app_is_backgrounded", bool);
        R2 = a("forward_javascript_to_webview_video_button", bool);
        S2 = a("nsuttcl", bool);
        T2 = a("submit_postback_timeout", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        U2 = a("submit_postback_retries", 4);
        V2 = a("max_postback_attempts", 3);
        W2 = a("max_persisted_postbacks", 100);
        X2 = a("submit_web_tracker_timeout", Integer.valueOf((int) timeUnit2.toMillis(7L)));
        Y2 = a("sossp", bool);
        Z2 = a("spp", bool2);
        f6616a3 = a("get_retry_delay_v1", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        b3 = a("http_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        f6630c3 = a("http_socket_timeout", Integer.valueOf((int) timeUnit2.toMillis(20L)));
        f6638d3 = a("force_ssl", bool);
        f6644e3 = a("fetch_ad_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        f6652f3 = a("fetch_ad_retry_count_v1", 1);
        f6660g3 = a("faer", bool);
        f6668h3 = a("faroae", bool);
        f6676i3 = a("submit_data_retry_count_v1", 1);
        j3 = a("response_buffer_size", 16000);
        f6691k3 = a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        f6699l3 = a("fetch_basic_settings_retry_count", 3);
        f6707m3 = a("fetch_basic_settings_on_reconnect", bool);
        f6715n3 = a("skip_fetch_basic_settings_if_not_connected", bool);
        f6723o3 = a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) timeUnit2.toMillis(2L)));
        f6731p3 = a("idflrwbe", bool);
        f6739q3 = a("falawpr", bool);
        f6747r3 = a("sort_query_parameters", bool);
        f6754s3 = com.applovin.impl.mediation.ads.e.b(timeUnit2, 10L, "communicator_request_timeout_ms");
        f6761t3 = a("communicator_request_retry_count", 3);
        f6767u3 = com.applovin.impl.mediation.ads.e.b(timeUnit2, 2L, "communicator_request_retry_delay_ms");
        f6774v3 = a("rfbsd_ms", -1L);
        f6782w3 = a("ehkpd_ms", 500L);
        f6790x3 = a("rironc", bool);
        f6798y3 = a("rroncbd", bool);
        f6805z3 = com.applovin.impl.mediation.ads.e.b(timeUnit2, 5L, "wverc_ms");
        A3 = a("sducifm", bool);
        B3 = a("ad_session_minutes", 60);
        C3 = a("session_tracking_cooldown_on_event_fire", bool2);
        D3 = a("session_tracking_resumed_cooldown_minutes", 90L);
        E3 = a("session_tracking_paused_cooldown_minutes", 90L);
        F3 = a("dc_v2", bool);
        G3 = a("dce", bool2);
        H3 = a("qq", bool);
        I3 = a("qq1", bool2);
        J3 = a("qq2", bool2);
        K3 = a("qq3", bool2);
        L3 = a("qq4", bool2);
        M3 = a("qq5", bool2);
        N3 = a("qq6", bool2);
        O3 = a("qq7", bool2);
        P3 = a("qq8", bool2);
        Q3 = a("qq9", bool);
        R3 = a("qq10", bool2);
        S3 = a("qq11", bool2);
        T3 = a("pui", bool2);
        U3 = a("plugin_version", "");
        V3 = a("ccbtbsic", bool);
        W3 = a("hgn", bool2);
        X3 = a("cso", bool2);
        Y3 = a("cfs", bool2);
        Z3 = a("cmi", bool2);
        f6617a4 = a("crat", bool2);
        f6623b4 = a("cvs", bool2);
        f6631c4 = a("caf", bool2);
        f6639d4 = a("cf", bool2);
        f6645e4 = a("cmtl", bool2);
        f6653f4 = a("cnr", bool2);
        f6661g4 = a("ccr", bool);
        f6669h4 = a("adr", bool2);
        f6677i4 = a("volume_normalization_factor", Float.valueOf(6.6666665f));
        f6684j4 = a("system_user_agent_collection_enabled", bool);
        f6692k4 = a("user_agent_collection_enabled", bool);
        f6700l4 = a("collect_device_angle", bool2);
        f6708m4 = a("collect_device_movement", bool2);
        f6716n4 = a("cipc", bool2);
        f6724o4 = a("movement_degradation", Float.valueOf(0.75f));
        f6732p4 = a("device_sensor_period_ms", 250);
        f6740q4 = a("idcw", bool);
        f6748r4 = a("fetch_basic_settings_delay_ms", 1500);
        f6755s4 = a("mps", "");
        f6762t4 = a("mpsl", 3);
        u4 = a("mpis", "com.applovin,dalvik,java,android,com.android");
        f6775v4 = a("cmps", bool);
        f6783w4 = a("rmps", bool);
        f6791x4 = a("collect_webview_package_info", bool);
        y4 = a("webview_package_names", "com.google.android.webview,com.android.webview");
        f6806z4 = a("collect_opengl_version", bool);
        A4 = a("ncre", bool);
        B4 = a("ncrs", "4,5,6,7,8,11,16");
        C4 = a("dcttl_1_seconds", 5);
        D4 = a("dcttl_2_seconds", 30);
        E4 = a("dcttl_3_seconds", Integer.valueOf((int) timeUnit.toSeconds(1L)));
        F4 = a("dcttl_4_seconds", Integer.valueOf((int) timeUnit.toSeconds(30L)));
        G4 = a("dcttl_5_seconds", Integer.valueOf((int) TimeUnit.HOURS.toSeconds(1L)));
        H4 = a("dcttl_6_seconds", Integer.valueOf((int) timeUnit3.toSeconds(1L)));
        I4 = a("cclia", bool2);
        J4 = a("lccdm", 10L);
        K4 = a("lmfd", 2);
        L4 = a("is_track_ad_info", bool2);
        M4 = a("umsm", bool);
        N4 = a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
        O4 = a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
        P4 = a("vast_max_response_length", 640000);
        Q4 = a("vast_max_wrapper_depth", 5);
        R4 = a("vast_unsupported_video_extensions", "ogv,flv");
        S4 = a("vast_unsupported_video_types", "video/ogg,video/x-flv");
        T4 = a("vast_validate_with_extension_if_no_video_type", bool2);
        U4 = a("vast_wrapper_resolution_retry_count_v1", 1);
        V4 = a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        W4 = a("vast_industry_icon_max_size", 20);
        X4 = a("vast_industry_icon_margin", 12);
        Y4 = a("vast_industry_icon_gravity", 85);
        Z4 = a("vast_native_mute_button_size", 24);
        f6618a5 = a("vast_native_play_pause_button_size", 24);
        f6624b5 = a("vast_native_video_widget_padding", 6);
        f6632c5 = a("vast_native_video_widget_alpha", Float.valueOf(0.5f));
        f6640d5 = a("vast_native_video_widgets_enabled", bool2);
        f6646e5 = a("vast_replay_video_upon_completion", bool2);
        f6654f5 = a("vast_replay_icon_size", 64);
        f6662g5 = a("vcjfhr", bool);
        f6670h5 = a("vcjfhrr", "(?:<|%3C)script[^>]*src=\"(https[^\"]*\\.js[^\"]*)\".*?(?:>|%3E)");
        f6678i5 = a("vpenfxr", "(<Error><!\\[CDATA\\[[^>]*><\\/Error>)");
        f6685j5 = a("ree", bool2);
        qi.a aVar = qi.a.DEFAULT;
        f6693k5 = a("ree_t", Integer.valueOf(aVar.b()));
        f6701l5 = a("btee", bool2);
        f6709m5 = a("btet", Integer.valueOf(aVar.b()));
        f6717n5 = a("reetoa", bool);
        f6725o5 = a("reet_msfs", Integer.valueOf(aVar.b()));
        f6733p5 = a("reet_msma", Integer.valueOf(qi.a.V2.b()));
        f6741q5 = a("reet_msmd", Integer.valueOf(aVar.b()));
        f6749r5 = a("reet_asfp", Integer.valueOf(aVar.b()));
        s5 = a("reet_asfg", Integer.valueOf(aVar.b()));
        t5 = a("reet_aset", Integer.valueOf(aVar.b()));
        f6768u5 = a("reet_esdi", Integer.valueOf(aVar.b()));
        f6776v5 = a("reet_esrp", Integer.valueOf(aVar.b()));
        f6784w5 = a("apdra", bool);
        f6792x5 = a("apdrfs", bool);
        f6799y5 = a("apdrma", bool);
        f6807z5 = a("apdrmd", bool);
        A5 = a("apdrfa", bool);
        B5 = a("apdrev", bool);
        C5 = a("apdrdi", bool);
        D5 = a("apdrrp", bool);
        E5 = a("server_timestamp_ms", 0L);
        F5 = a("device_timestamp_ms", 0L);
        G5 = a("gzip_min_length", 0);
        H5 = a("gzip_encoding_default", bool);
        I5 = a("fetch_settings_gzip", bool);
        J5 = a("device_init_gzip", bool);
        K5 = a("fetch_ad_gzip", bool);
        L5 = a("event_tracking_gzip", bool);
        M5 = a("reward_postback_gzip", bool);
        N5 = a("handle_render_process_gone", bool2);
        O5 = a("rworpg", bool2);
        P5 = a("fdadaomr", bool2);
        Q5 = a("teorpc", bool);
        R5 = a("set_webview_render_process_client", bool);
        S5 = a("disable_webview_hardware_acceleration", bool);
        T5 = a("anr_detection_enabled", bool);
        U5 = a("anr_trigger_millis", 4000L);
        V5 = a("anr_touch_millis", 3000L);
        W5 = a("anr_check_millis", 3000L);
        X5 = a("uobid", bool2);
        Y5 = a("bvde", bool);
        Z5 = a("bvdidm", 1000L);
        f6619a6 = a("bvdim", 4000L);
        f6625b6 = a("bvdrs", 10);
        f6633c6 = a("bvdct", 230);
        f6641d6 = a("bvdict", 3);
        f6647e6 = a("bvad", bool);
        f6655f6 = a("bvebb", bool2);
        f6663g6 = a("bvscb", bool2);
        f6671h6 = a("bvlmtb", -1L);
        f6679i6 = a("dwvvb", bool);
        f6686j6 = a("stcpc", bool2);
        f6694k6 = a("stcic", bool2);
        f6702l6 = a("clacaf", bool);
        f6710m6 = a("qjscwwvl", bool);
        f6718n6 = a("web_contents_debugging_enabled", bool);
        f6726o6 = a("fcioiauiidb", bool2);
        f6734p6 = a("teouauiidb", bool2);
        f6742q6 = a("usc", bool);
        r6 = a("should_apply_web_view_settings_to_web_view_button", bool);
        f6756s6 = a("config_consent_dialog_state", AppLovinMediationProvider.UNKNOWN);
        f6763t6 = a("country_code", "");
        f6769u6 = a("consent_flow_doc_url", "https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow");
        f6777v6 = a("consent_flow_unity_doc_url", "https://developers.applovin.com/en/unity/overview/terms-and-privacy-policy-flow");
        f6785w6 = a("cfadtml", 20);
        f6793x6 = a("enable_custom_tabs_service", bool);
        f6800y6 = a("custom_tabs_service_reconnect_delay_ms", -1L);
        f6808z6 = a("ps_etr", bool);
        A6 = com.applovin.impl.mediation.ads.e.b(timeUnit3, 7L, "ps_tri_ms");
        B6 = a("ps_ftri_ms", -1L);
        C6 = a("ps_sroftr", bool);
        D6 = a("ps_sroftrof", bool);
        E6 = a("communicator_enabled", bool2);
        F6 = a("adse", bool2);
    }

    public oj(String str, Object obj) {
        if (str != null) {
            if (obj != null) {
                this.a = str;
                this.f6809b = obj;
                return;
            }
            throw new IllegalArgumentException("No default value specified");
        }
        throw new IllegalArgumentException("No name specified");
    }

    public static Collection c() {
        return Collections.synchronizedCollection(f6634d.values());
    }

    public Object a(Object obj) {
        return this.f6809b.getClass().cast(obj);
    }

    public String b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof oj) {
            return this.a.compareTo(((oj) obj).b());
        }
        return 0;
    }

    public Object a() {
        return this.f6809b;
    }

    public static oj a(String str, Object obj) {
        if (obj != null) {
            if (f6626c.contains(obj.getClass())) {
                oj ojVar = new oj(str, obj);
                Map map = f6634d;
                if (!map.containsKey(str)) {
                    map.put(str, ojVar);
                    return ojVar;
                }
                throw new IllegalArgumentException(vd.e.e("Setting has already been used: ", str));
            }
            throw new IllegalArgumentException("Unsupported value type: " + obj.getClass());
        }
        throw new IllegalArgumentException("No default value specified");
    }
}
