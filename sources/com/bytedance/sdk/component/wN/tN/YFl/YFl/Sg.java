package com.bytedance.sdk.component.wN.tN.YFl.YFl;

import android.util.Log;
import com.bytedance.sdk.component.wN.tN.YFl.YFl.YFl;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public class Sg implements com.bytedance.sdk.component.wN.tN {
    private YFl Sg;
    private long YFl;

    public Sg(File file, long j3, ExecutorService executorService) {
        this.YFl = j3;
        try {
            this.Sg = YFl.YFl(file, 20210302, 1, j3, executorService);
        } catch (IOException e2) {
            Log.w("LruCountDiskCache", e2.toString());
        }
    }

    @Override // com.bytedance.sdk.component.wN.YFl
    /* renamed from: tN, reason: merged with bridge method [inline-methods] */
    public boolean Sg(String str) {
        boolean z10 = false;
        try {
            try {
                YFl.tN YFl = this.Sg.YFl(str);
                if (YFl != null) {
                    z10 = true;
                }
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(YFl);
                return z10;
            } catch (IOException e2) {
                Log.w("LruCountDiskCache", e2.getMessage());
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(null);
                return false;
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(null);
            throw th2;
        }
    }

    @Override // com.bytedance.sdk.component.wN.YFl
    /* renamed from: Sg, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] YFl(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        YFl yFl = this.Sg;
        InputStream inputStream2 = null;
        if (yFl == null || str == null) {
            return null;
        }
        try {
            YFl.tN YFl = yFl.YFl(str);
            if (YFl == null) {
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(null);
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(null);
                return null;
            }
            inputStream = YFl.YFl(0);
            if (inputStream != null) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (IOException e2) {
                    e = e2;
                    byteArrayOutputStream = null;
                    Log.w("LruCountDiskCache", e.toString());
                    com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream);
                    com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(byteArrayOutputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = null;
                    inputStream2 = inputStream;
                    com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream2);
                    com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(byteArrayOutputStream);
                    throw th;
                }
                try {
                    try {
                        byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream2 = inputStream;
                        com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream2);
                        com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    Log.w("LruCountDiskCache", e.toString());
                    com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream);
                    com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(byteArrayOutputStream);
                    return null;
                }
            } else {
                byteArrayOutputStream = null;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream);
            com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(byteArrayOutputStream);
            return byteArray;
        } catch (IOException e11) {
            e = e11;
            inputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream2);
            com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(byteArrayOutputStream);
            throw th;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.wN.tN
    public InputStream YFl(String str) {
        YFl yFl = this.Sg;
        if (yFl == null) {
            return null;
        }
        try {
            YFl.tN YFl = yFl.YFl(str);
            if (YFl != null) {
                return YFl.YFl(0);
            }
        } catch (IOException e2) {
            Log.w("LruCountDiskCache", e2.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.wN.YFl
    public boolean YFl(String str, byte[] bArr) {
        Closeable closeable;
        YFl yFl = this.Sg;
        if (yFl == null || bArr == null || str == null) {
            return false;
        }
        YFl.C0096YFl c0096YFl = null;
        Closeable closeable2 = null;
        try {
            try {
                YFl.C0096YFl Sg = yFl.Sg(str);
                try {
                    if (Sg == null) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                        com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(null);
                        return false;
                    }
                    OutputStream YFl = Sg.YFl(0);
                    if (YFl == YFl.tN) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                        com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(YFl);
                        return false;
                    }
                    YFl.write(bArr);
                    Sg.YFl();
                    this.Sg.YFl();
                    com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(YFl);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    closeable = null;
                    c0096YFl = Sg;
                    try {
                        Log.w("LruCountDiskCache", e.toString());
                        if (c0096YFl != null) {
                            try {
                                c0096YFl.Sg();
                            } catch (IOException unused) {
                            }
                        }
                        com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(closeable);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable2 = closeable;
                        com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(closeable2);
                        throw th;
                    }
                }
            } catch (IOException e10) {
                e = e10;
                closeable = null;
            }
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(closeable2);
            throw th;
        }
    }
}
