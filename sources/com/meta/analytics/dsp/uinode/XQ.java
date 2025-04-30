package com.meta.analytics.dsp.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: assets/audience_network.dex */
public final class XQ implements CL {
    public static String[] A05 = {"YO3Mv", "DxVAQWWu8j9i6k1h5ZfxybzoYJdsy2xl", "vXk7alCMSJGdJNe2n8WQkC5NRefPTIq", "ZV", "S8Uid7BWM3mGwyARzsRqwPOCPslD34Eg", "BP", "k4eI01zMPbHAOvERg49f6jW6RoPQTjCj", "LVriLWZDKqqvbv6paz1EHGa9qDGzRuUD"};
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C1217Hz A04;

    public XQ(XS xs) {
        C1217Hz c1217Hz = xs.A00;
        this.A04 = c1217Hz;
        c1217Hz.A0Y(12);
        this.A02 = c1217Hz.A0H() & 255;
        this.A03 = c1217Hz.A0H();
    }

    @Override // com.meta.analytics.dsp.uinode.CL
    public final int A7o() {
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.CL
    public final boolean A93() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.CL
    public final int AEN() {
        int i9 = this.A02;
        if (i9 == 8) {
            return this.A04.A0E();
        }
        if (i9 == 16) {
            C1217Hz c1217Hz = this.A04;
            if (A05[4].charAt(8) == 'Z') {
                throw new RuntimeException();
            }
            A05[2] = "dItPwdgOkLJrEcAMKiFMJfVFB7ycDui";
            return c1217Hz.A0I();
        }
        int i10 = this.A01;
        this.A01 = i10 + 1;
        if (i10 % 2 == 0) {
            int A0E = this.A04.A0E();
            this.A00 = A0E;
            return (A0E & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
        return this.A00 & 15;
    }
}
