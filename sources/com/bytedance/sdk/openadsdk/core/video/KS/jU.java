package com.bytedance.sdk.openadsdk.core.video.KS;

import com.bykv.vk.openvk.component.video.api.zp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class jU extends com.bykv.vk.openvk.component.video.zp.jU.jU {
    private final zp jU;
    private final List<lMd> zp = Collections.synchronizedList(new ArrayList());
    private int lMd = 1;
    private int KS = 1;

    /* loaded from: classes.dex */
    public interface lMd extends zp.InterfaceC0051zp {
        void zp(int i9, int i10);
    }

    public jU() {
        zp zpVar = new zp();
        this.jU = zpVar;
        super.zp(zpVar);
        zp(500);
    }

    public static /* synthetic */ int zp(jU jUVar) {
        int i9 = jUVar.KS;
        jUVar.KS = i9 + 1;
        return i9;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.jU
    public long KVG() {
        return super.KVG() * this.lMd;
    }

    public int cz() {
        return this.KS;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.jU
    public long woN() {
        return ((this.KS - 1) * super.KVG()) + super.woN();
    }

    /* loaded from: classes.dex */
    public class zp implements zp.InterfaceC0051zp {
        private zp() {
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
        public void COT(com.bykv.vk.openvk.component.video.api.zp zpVar) {
            Iterator it = jU.this.zp.iterator();
            while (it.hasNext()) {
                ((lMd) it.next()).COT(zpVar);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
        public void KS(com.bykv.vk.openvk.component.video.api.zp zpVar) {
            Iterator it = jU.this.zp.iterator();
            while (it.hasNext()) {
                ((lMd) it.next()).KS(zpVar);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
        public void jU(com.bykv.vk.openvk.component.video.api.zp zpVar) {
            Iterator it = jU.this.zp.iterator();
            while (it.hasNext()) {
                ((lMd) it.next()).jU(zpVar);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
        public void lMd(com.bykv.vk.openvk.component.video.api.zp zpVar) {
            Iterator it = jU.this.zp.iterator();
            while (it.hasNext()) {
                ((lMd) it.next()).lMd(zpVar);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
        public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar) {
            jU.zp(jU.this);
            if (jU.this.KS <= jU.this.lMd) {
                Iterator it = jU.this.zp.iterator();
                while (it.hasNext()) {
                    ((lMd) it.next()).zp(jU.this.KS, jU.this.lMd);
                }
                jU.this.YW();
                return;
            }
            Iterator it2 = jU.this.zp.iterator();
            while (it2.hasNext()) {
                ((lMd) it2.next()).zp(zpVar);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
        public void lMd(com.bykv.vk.openvk.component.video.api.zp zpVar, int i9) {
            Iterator it = jU.this.zp.iterator();
            while (it.hasNext()) {
                ((lMd) it.next()).lMd(zpVar, i9);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
        public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, long j7) {
            Iterator it = jU.this.zp.iterator();
            while (it.hasNext()) {
                ((lMd) it.next()).zp(zpVar, j7);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
        public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, com.bykv.vk.openvk.component.video.api.KS.zp zpVar2) {
            Iterator it = jU.this.zp.iterator();
            while (it.hasNext()) {
                ((lMd) it.next()).zp(zpVar, zpVar2);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
        public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, boolean z8) {
            Iterator it = jU.this.zp.iterator();
            while (it.hasNext()) {
                ((lMd) it.next()).zp(zpVar, z8);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
        public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, int i9, int i10) {
            Iterator it = jU.this.zp.iterator();
            while (it.hasNext()) {
                ((lMd) it.next()).zp(zpVar, i9, i10);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
        public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, int i9, int i10, int i11) {
            Iterator it = jU.this.zp.iterator();
            while (it.hasNext()) {
                ((lMd) it.next()).zp(zpVar, i9, i10, i11);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
        public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, int i9) {
            Iterator it = jU.this.zp.iterator();
            while (it.hasNext()) {
                ((lMd) it.next()).zp(zpVar, i9);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
        public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, long j7, long j9) {
            Iterator it = jU.this.zp.iterator();
            while (it.hasNext()) {
                ((lMd) it.next()).zp(zpVar, j7, j9);
            }
        }
    }

    public void KS(int i9) {
        this.lMd = Math.max(1, i9);
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.jU
    public void zp(zp.InterfaceC0051zp interfaceC0051zp) {
        if (interfaceC0051zp instanceof lMd) {
            if (this.zp.contains(interfaceC0051zp)) {
                return;
            }
            this.zp.add((lMd) interfaceC0051zp);
            return;
        }
        super.zp(interfaceC0051zp);
    }
}
