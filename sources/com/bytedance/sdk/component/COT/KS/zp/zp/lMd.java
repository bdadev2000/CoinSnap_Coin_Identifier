package com.bytedance.sdk.component.COT.KS.zp.zp;

import android.util.Log;
import com.bytedance.sdk.component.COT.KS.zp.zp.zp;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class lMd implements com.bytedance.sdk.component.COT.KS {
    private zp lMd;
    private long zp;

    public lMd(File file, long j7, ExecutorService executorService) {
        this.zp = j7;
        try {
            this.lMd = zp.zp(file, 20210302, 1, j7, executorService);
        } catch (IOException e4) {
            Log.w("LruCountDiskCache", e4.toString());
        }
    }

    @Override // com.bytedance.sdk.component.COT.zp
    /* renamed from: KS, reason: merged with bridge method [inline-methods] */
    public boolean lMd(String str) {
        boolean z8 = false;
        try {
            try {
                zp.KS zp = this.lMd.zp(str);
                if (zp != null) {
                    z8 = true;
                }
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(zp);
                return z8;
            } catch (IOException e4) {
                Log.w("LruCountDiskCache", e4.getMessage());
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(null);
                return false;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.COT.KS.KS.lMd.zp(null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable, java.io.InputStream] */
    @Override // com.bytedance.sdk.component.COT.zp
    /* renamed from: lMd, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] zp(String str) {
        Closeable closeable;
        Closeable closeable2;
        ByteArrayOutputStream byteArrayOutputStream;
        zp zpVar = this.lMd;
        Closeable closeable3 = null;
        if (zpVar != null) {
            try {
                if (str != 0) {
                    try {
                        zp.KS zp = zpVar.zp((String) str);
                        if (zp == null) {
                            com.bytedance.sdk.component.COT.KS.KS.lMd.zp(null);
                            com.bytedance.sdk.component.COT.KS.KS.lMd.zp(null);
                            return null;
                        }
                        str = zp.zp(0);
                        if (str != 0) {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                            } catch (IOException e4) {
                                e = e4;
                                byteArrayOutputStream = null;
                                closeable2 = str;
                                Log.w("LruCountDiskCache", e.toString());
                                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable2);
                                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(byteArrayOutputStream);
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                closeable = null;
                                closeable3 = str;
                                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable3);
                                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable);
                                throw th;
                            }
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = str.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
                            } catch (IOException e9) {
                                e = e9;
                                closeable2 = str;
                                Log.w("LruCountDiskCache", e.toString());
                                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable2);
                                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(byteArrayOutputStream);
                                return null;
                            }
                        } else {
                            byteArrayOutputStream = null;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        com.bytedance.sdk.component.COT.KS.KS.lMd.zp(str);
                        com.bytedance.sdk.component.COT.KS.KS.lMd.zp(byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e10) {
                        e = e10;
                        closeable2 = null;
                        byteArrayOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = null;
                        com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable3);
                        com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.COT.KS
    public InputStream zp(String str) {
        zp zpVar = this.lMd;
        if (zpVar == null) {
            return null;
        }
        try {
            zp.KS zp = zpVar.zp(str);
            if (zp != null) {
                return zp.zp(0);
            }
        } catch (IOException e4) {
            Log.w("LruCountDiskCache", e4.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.COT.zp
    public boolean zp(String str, byte[] bArr) {
        Closeable closeable;
        zp zpVar = this.lMd;
        if (zpVar == null || bArr == null || str == null) {
            return false;
        }
        Closeable closeable2 = null;
        zp.C0071zp c0071zp = null;
        try {
            try {
                zp.C0071zp lMd = zpVar.lMd(str);
                try {
                    if (lMd == null) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                        com.bytedance.sdk.component.COT.KS.KS.lMd.zp(null);
                        return false;
                    }
                    OutputStream zp = lMd.zp(0);
                    if (zp == zp.KS) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                        com.bytedance.sdk.component.COT.KS.KS.lMd.zp(zp);
                        return false;
                    }
                    zp.write(bArr);
                    lMd.zp();
                    this.lMd.zp();
                    com.bytedance.sdk.component.COT.KS.KS.lMd.zp(zp);
                    return true;
                } catch (IOException e4) {
                    e = e4;
                    closeable = null;
                    c0071zp = lMd;
                    try {
                        Log.w("LruCountDiskCache", e.toString());
                        if (c0071zp != null) {
                            try {
                                c0071zp.lMd();
                            } catch (IOException unused) {
                            }
                        }
                        com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        closeable2 = closeable;
                        com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable2);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(closeable2);
                throw th;
            }
        } catch (IOException e9) {
            e = e9;
            closeable = null;
        }
    }
}
