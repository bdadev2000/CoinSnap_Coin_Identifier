package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.RequiresApi;
import java.io.IOException;

@RequiresApi(21)
/* loaded from: classes.dex */
final class ParcelFileDescriptorRewinder$InternalRewinder {
    public final ParcelFileDescriptor a;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }
}
