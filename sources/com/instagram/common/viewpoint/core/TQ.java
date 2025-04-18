package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class TQ extends AbstractC02684c<TK> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MQ A04;
    public MR A05;
    public String A06;
    public List<QK> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC1187cD A0A;
    public final C03226f A0B;
    public final C1045Zs A0C;
    public final J7 A0D;
    public final C0688Lv A0E;
    public final TV A0F;
    public final C0833Rk A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public TQ(C1045Zs c1045Zs, List<QK> list, AbstractC1187cD abstractC1187cD, J7 j7, C03226f c03226f, C0833Rk c0833Rk, C0688Lv c0688Lv, MR mr, String str, int i2, int i3, int i4, int i5, TV tv, MQ mq) {
        this.A0C = c1045Zs;
        this.A0D = j7;
        this.A0B = c03226f;
        this.A0G = c0833Rk;
        this.A0E = c0688Lv;
        this.A05 = mr;
        this.A0A = abstractC1187cD;
        this.A07 = list;
        this.A00 = i2;
        this.A03 = i5;
        this.A06 = str;
        this.A01 = i4;
        this.A02 = i3;
        this.A0F = tv;
        this.A04 = mq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC02684c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final TK A0C(ViewGroup viewGroup, int i2) {
        return new TK(PN.A00(new C0756Ol(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0J(this.A04).A0M(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A1Q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC02684c
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0D(TK tk, int i2) {
        tk.A0j(this.A07.get(i2), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i2 == 0) {
            tk.AGH();
            this.A08 = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02684c
    public final int A0E() {
        return this.A07.size();
    }
}
