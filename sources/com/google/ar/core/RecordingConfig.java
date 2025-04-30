package com.google.ar.core;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class RecordingConfig {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public RecordingConfig() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private native void nativeAddTrack(long j7, long j9, long j10);

    private static native long nativeCreateRecordingConfig(long j7);

    private static native void nativeDestroyRecordingConfig(long j7, long j9);

    private native boolean nativeGetAutoStopOnPause(long j7, long j9);

    private native String nativeGetMp4DatasetFilePath(long j7, long j9);

    private native String nativeGetMp4DatasetUri(long j7, long j9);

    private native int nativeGetRecordingRotation(long j7, long j9);

    private native void nativeSetAutoStopOnPause(long j7, long j9, boolean z8);

    private native void nativeSetMp4DatasetFilePath(long j7, long j9, String str);

    private native void nativeSetMp4DatasetUri(long j7, long j9, String str);

    private native void nativeSetRecordingRotation(long j7, long j9, int i9);

    @NonNull
    public RecordingConfig addTrack(Track track) {
        nativeAddTrack(this.session.nativeWrapperHandle, this.nativeHandle, track.nativeHandle);
        return this;
    }

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeDestroyRecordingConfig(this.nativeSymbolTableHandle, j7);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    public boolean getAutoStopOnPause() {
        return nativeGetAutoStopOnPause(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @Nullable
    @Deprecated
    public String getMp4DatasetFilePath() {
        return nativeGetMp4DatasetFilePath(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @Nullable
    public Uri getMp4DatasetUri() {
        String nativeGetMp4DatasetUri = nativeGetMp4DatasetUri(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetMp4DatasetUri == null) {
            return null;
        }
        return Uri.parse(nativeGetMp4DatasetUri);
    }

    public int getRecordingRotation() {
        return nativeGetRecordingRotation(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @NonNull
    public RecordingConfig setAutoStopOnPause(boolean z8) {
        nativeSetAutoStopOnPause(this.session.nativeWrapperHandle, this.nativeHandle, z8);
        return this;
    }

    @NonNull
    @Deprecated
    public RecordingConfig setMp4DatasetFilePath(String str) {
        nativeSetMp4DatasetFilePath(this.session.nativeWrapperHandle, this.nativeHandle, str);
        return this;
    }

    @NonNull
    public RecordingConfig setMp4DatasetUri(Uri uri) {
        nativeSetMp4DatasetUri(this.session.nativeWrapperHandle, this.nativeHandle, uri.toString());
        return this;
    }

    @NonNull
    public RecordingConfig setRecordingRotation(int i9) {
        nativeSetRecordingRotation(this.session.nativeWrapperHandle, this.nativeHandle, i9);
        return this;
    }

    public RecordingConfig(Session session) {
        this.session = session;
        this.nativeHandle = nativeCreateRecordingConfig(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
