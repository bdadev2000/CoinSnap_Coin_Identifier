package com.bykv.vk.openvk.component.video.zp.lMd.zp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.zp.lMd.COT;
import com.bykv.vk.openvk.component.video.zp.lMd.jU;
import com.bytedance.sdk.component.ku.HWF;
import com.bytedance.sdk.component.ku.ku;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class KS extends com.bykv.vk.openvk.component.video.zp.lMd.zp.zp {
    private final Handler Bj;
    private final ReentrantReadWriteLock.WriteLock COT;
    private final Set<zp> HWF;
    private final ReentrantReadWriteLock KS;
    private volatile long QR;
    private final lMd YW;
    private final Runnable dT;
    private final ReentrantReadWriteLock.ReadLock jU;
    private volatile float ku;
    private final LinkedHashMap<String, File> lMd = new LinkedHashMap<>(0, 0.75f, true);
    public final File zp;

    /* loaded from: classes.dex */
    public static final class lMd {
        private final Map<String, Integer> zp;

        private lMd() {
            this.zp = new HashMap();
        }

        public synchronized boolean KS(String str) {
            if (!TextUtils.isEmpty(str)) {
                return this.zp.containsKey(str);
            }
            return false;
        }

        public synchronized void lMd(String str) {
            Integer num;
            if (!TextUtils.isEmpty(str) && (num = this.zp.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.zp.remove(str);
                    return;
                }
                this.zp.put(str, Integer.valueOf(num.intValue() - 1));
            }
        }

        public synchronized void zp(String str) {
            if (!TextUtils.isEmpty(str)) {
                Integer num = this.zp.get(str);
                if (num == null) {
                    this.zp.put(str, 1);
                    return;
                }
                this.zp.put(str, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    /* loaded from: classes.dex */
    public interface zp {
        void zp(String str);

        void zp(Set<String> set);
    }

    public KS(File file) throws IOException {
        String str;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.KS = reentrantReadWriteLock;
        this.jU = reentrantReadWriteLock.readLock();
        this.COT = reentrantReadWriteLock.writeLock();
        this.HWF = Collections.newSetFromMap(new ConcurrentHashMap());
        this.QR = 104857600L;
        this.ku = 0.5f;
        this.YW = new lMd();
        this.dT = new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.lMd.zp.KS.1
            @Override // java.lang.Runnable
            public void run() {
                HWF.lMd(new ku("cleanupCmd", 1) { // from class: com.bykv.vk.openvk.component.video.zp.lMd.zp.KS.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        KS ks = KS.this;
                        ks.lMd(ks.QR);
                    }
                });
            }
        };
        this.Bj = new Handler(Looper.getMainLooper());
        if (file != null && file.exists() && file.isDirectory() && file.canRead() && file.canWrite()) {
            this.zp = file;
            HWF.lMd(new ku("DiskLruCache", 5) { // from class: com.bykv.vk.openvk.component.video.zp.lMd.zp.KS.2
                @Override // java.lang.Runnable
                public void run() {
                    KS.this.lMd();
                }
            });
            return;
        }
        if (file == null) {
            str = " dir null";
        } else {
            str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
        }
        throw new IOException("dir error!  ".concat(String.valueOf(str)));
    }

    private void KS() {
        this.Bj.removeCallbacks(this.dT);
        this.Bj.postDelayed(this.dT, 10000L);
    }

    @Override // com.bykv.vk.openvk.component.video.zp.lMd.zp.zp
    public File jU(String str) {
        if (this.jU.tryLock()) {
            File file = this.lMd.get(str);
            this.jU.unlock();
            return file;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd() {
        this.COT.lock();
        try {
            File[] listFiles = this.zp.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                final HashMap hashMap = new HashMap(listFiles.length);
                ArrayList arrayList = new ArrayList(listFiles.length);
                for (File file : listFiles) {
                    if (file.isFile()) {
                        arrayList.add(file);
                        hashMap.put(file, Long.valueOf(file.lastModified()));
                    }
                }
                Collections.sort(arrayList, new Comparator<File>() { // from class: com.bykv.vk.openvk.component.video.zp.lMd.zp.KS.3
                    @Override // java.util.Comparator
                    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
                    public int compare(File file2, File file3) {
                        long longValue = ((Long) hashMap.get(file2)).longValue() - ((Long) hashMap.get(file3)).longValue();
                        if (longValue < 0) {
                            return -1;
                        }
                        if (longValue > 0) {
                            return 1;
                        }
                        return 0;
                    }
                });
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    this.lMd.put(zp(file2), file2);
                }
            }
            this.COT.unlock();
            KS();
        } catch (Throwable th) {
            this.COT.unlock();
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.zp.lMd.zp.zp
    public File KS(String str) {
        this.jU.lock();
        File file = this.lMd.get(str);
        this.jU.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.zp, str);
        this.COT.lock();
        this.lMd.put(str, file2);
        this.COT.unlock();
        Iterator<zp> it = this.HWF.iterator();
        while (it.hasNext()) {
            it.next().zp(str);
        }
        KS();
        return file2;
    }

    public void zp(zp zpVar) {
        if (zpVar != null) {
            this.HWF.add(zpVar);
        }
    }

    public void zp(long j7) {
        this.QR = j7;
        KS();
    }

    public void zp() {
        jU.KS().jU();
        Context zp2 = COT.zp();
        if (zp2 != null) {
            com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS.zp(zp2).zp(0);
        }
        this.Bj.removeCallbacks(this.dT);
        HWF.lMd(new ku("clear", 1) { // from class: com.bykv.vk.openvk.component.video.zp.lMd.zp.KS.4
            @Override // java.lang.Runnable
            public void run() {
                KS.this.lMd(0L);
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.zp.lMd.zp.zp
    public void zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.YW.zp(str);
    }

    private String zp(File file) {
        return file.getName();
    }

    @Override // com.bykv.vk.openvk.component.video.zp.lMd.zp.zp
    public void lMd(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.YW.lMd(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(long j7) {
        HashSet hashSet;
        long j9;
        final HashSet hashSet2 = new HashSet();
        this.COT.lock();
        try {
            Iterator<Map.Entry<String, File>> it = this.lMd.entrySet().iterator();
            j9 = 0;
            while (it.hasNext()) {
                j9 += it.next().getValue().length();
            }
        } catch (Throwable unused) {
            hashSet = null;
        }
        if (j9 <= j7) {
            this.COT.unlock();
            return;
        }
        long j10 = ((float) j7) * this.ku;
        hashSet = new HashSet();
        try {
            for (Map.Entry<String, File> entry : this.lMd.entrySet()) {
                File value = entry.getValue();
                if (value != null && value.exists()) {
                    if (!this.YW.KS(zp(value))) {
                        long length = value.length();
                        File file = new File(value.getAbsolutePath() + "-tmp");
                        if (value.renameTo(file)) {
                            hashSet2.add(file);
                            j9 -= length;
                            hashSet.add(entry.getKey());
                        }
                    }
                } else {
                    hashSet.add(entry.getKey());
                }
                if (j9 <= j10) {
                    break;
                }
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                this.lMd.remove((String) it2.next());
            }
        } catch (Throwable unused2) {
        }
        this.COT.unlock();
        Iterator<zp> it3 = this.HWF.iterator();
        while (it3.hasNext()) {
            it3.next().zp(hashSet);
        }
        HWF.lMd(new ku("trimSize", 1) { // from class: com.bykv.vk.openvk.component.video.zp.lMd.zp.KS.5
            @Override // java.lang.Runnable
            public void run() {
                Iterator it4 = hashSet2.iterator();
                while (it4.hasNext()) {
                    try {
                        ((File) it4.next()).delete();
                    } catch (Throwable unused3) {
                    }
                }
            }
        });
    }
}
