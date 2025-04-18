package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class zzfgp {
    public static ParcelFileDescriptor zza(final InputStream inputStream) throws IOException {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
        zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgo
            @Override // java.lang.Runnable
            public final void run() {
                InputStream inputStream2 = inputStream;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                        try {
                            IOUtils.copyStream(inputStream2, autoCloseOutputStream);
                            autoCloseOutputStream.close();
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException unused) {
                }
            }
        });
        return parcelFileDescriptor;
    }
}
