package com.bykv.vk.openvk.component.video.zp.lMd.HWF;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.HWF.KS;
import com.bykv.vk.openvk.component.video.zp.lMd.COT;
import com.bykv.vk.openvk.component.video.zp.lMd.HWF;
import com.bykv.vk.openvk.component.video.zp.lMd.jU;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class zp {
    public static final boolean zp = KS.KS();
    private C0053zp KS;
    private HashMap<String, Boolean> lMd;

    /* loaded from: classes.dex */
    public static class lMd {
        private static final zp zp = new zp();
    }

    private static com.bykv.vk.openvk.component.video.zp.lMd.zp.KS KS() {
        File file = new File(com.bykv.vk.openvk.component.video.api.KS.zp().getCacheDir(), "proxy_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            com.bykv.vk.openvk.component.video.zp.lMd.zp.KS ks = new com.bykv.vk.openvk.component.video.zp.lMd.zp.KS(file);
            try {
                ks.zp(104857600L);
                return ks;
            } catch (IOException unused) {
                return ks;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public static zp zp() {
        return lMd.zp;
    }

    public boolean lMd() {
        if (this.KS != null) {
            return true;
        }
        com.bykv.vk.openvk.component.video.zp.lMd.zp.KS KS = KS();
        if (KS == null) {
            return false;
        }
        COT.zp(true);
        COT.lMd(true);
        COT.zp(1);
        HWF.zp().jU();
        try {
            C0053zp c0053zp = new C0053zp();
            this.KS = c0053zp;
            c0053zp.setName("csj_video_cache_preloader");
            this.KS.start();
            COT.zp(KS, com.bykv.vk.openvk.component.video.api.KS.zp());
            jU.KS();
            jU.KS().zp(10485759);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private zp() {
        this.lMd = new HashMap<>();
        lMd();
    }

    public boolean zp(com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        if (!lMd()) {
            return false;
        }
        this.KS.zp(ks);
        return true;
    }

    /* renamed from: com.bykv.vk.openvk.component.video.zp.lMd.HWF.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0053zp extends Thread {
        private final Queue<C0054zp> jU = new ArrayBlockingQueue(10);
        private Queue<C0054zp> lMd = new LinkedBlockingQueue();
        private boolean KS = true;
        private Queue<C0054zp> COT = new LinkedBlockingQueue();

        /* renamed from: com.bykv.vk.openvk.component.video.zp.lMd.HWF.zp$zp$zp, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0054zp {
            public String COT;
            public com.bykv.vk.openvk.component.video.api.KS.KS HWF;
            public String[] KS;
            public int jU;
            public String lMd;
            public int zp;

            public C0054zp() {
            }
        }

        public C0053zp() {
        }

        private void KS(C0054zp c0054zp) {
            if (c0054zp == null) {
                return;
            }
            this.lMd.offer(c0054zp);
            notify();
        }

        private synchronized void lMd(C0054zp c0054zp) {
            this.COT.add(c0054zp);
            notify();
        }

        private C0054zp zp(int i9, com.bykv.vk.openvk.component.video.api.KS.KS ks) {
            this.jU.size();
            C0054zp poll = this.jU.poll();
            if (poll == null) {
                poll = new C0054zp();
            }
            poll.zp = i9;
            poll.HWF = ks;
            return poll;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.KS) {
                synchronized (this) {
                    try {
                        if (!this.COT.isEmpty()) {
                            zp();
                        }
                        while (!this.lMd.isEmpty()) {
                            C0054zp poll = this.lMd.poll();
                            if (poll != null) {
                                int i9 = poll.zp;
                                if (i9 != 0) {
                                    if (i9 != 1) {
                                        if (i9 != 2) {
                                            if (i9 != 3) {
                                                if (i9 == 4) {
                                                    jU.KS().jU();
                                                    this.KS = false;
                                                }
                                            } else {
                                                jU.KS().jU();
                                                if (COT.KS() == null) {
                                                    if (COT.lMd() != null) {
                                                        COT.lMd().zp();
                                                    }
                                                } else {
                                                    COT.KS();
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            jU.KS().jU();
                                        }
                                    } else {
                                        jU.KS().zp(poll.lMd);
                                    }
                                } else {
                                    String[] strArr = poll.KS;
                                    if (strArr != null && strArr.length > 0) {
                                        ArrayList arrayList = new ArrayList();
                                        for (String str : poll.KS) {
                                            if (com.bykv.vk.openvk.component.video.zp.KS.zp.zp(str)) {
                                                arrayList.add(str);
                                            }
                                        }
                                        jU.KS().zp(false, !TextUtils.isEmpty(poll.COT), poll.jU, poll.lMd, (String[]) arrayList.toArray(new String[arrayList.size()]));
                                    }
                                }
                                zp(poll);
                            }
                        }
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        private void zp(C0054zp c0054zp) {
            c0054zp.KS = null;
            c0054zp.lMd = null;
            c0054zp.zp = -1;
            c0054zp.HWF = null;
            this.jU.offer(c0054zp);
        }

        private void zp() {
            while (true) {
                C0054zp poll = this.COT.poll();
                if (poll == null) {
                    return;
                }
                poll.lMd = poll.HWF.tG();
                poll.KS = new String[]{poll.HWF.tG()};
                int zp = poll.HWF.zp();
                if (zp <= 0) {
                    zp = poll.HWF.KS();
                }
                poll.jU = zp;
                poll.COT = poll.HWF.rV();
                if (!TextUtils.isEmpty(poll.HWF.rV())) {
                    poll.lMd = poll.HWF.rV();
                }
                poll.HWF = null;
                KS(poll);
            }
        }

        public void zp(com.bykv.vk.openvk.component.video.api.KS.KS ks) {
            lMd(zp(0, ks));
        }
    }

    public String lMd(com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        if (ks == null) {
            return null;
        }
        boolean z8 = !TextUtils.isEmpty(ks.rV());
        return HWF.zp().zp(false, z8, z8 ? ks.rV() : ks.tG(), ks.tG());
    }
}
