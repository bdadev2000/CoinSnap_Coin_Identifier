package com.glority.camera;

import android.os.Bundle;
import com.glority.android.core.data.LogEventArguments;
import kotlin.Metadata;

/* compiled from: CameraLogRecord.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/glority/camera/CameraLogRecord;", "", "()V", "autoFocusTime", "", "fileSize", "", "launchTime", "manualFocus", "", "module", "", "outputDataTime", "shotTs", "toBundle", "Landroid/os/Bundle;", "toString", "", "Companion", "camera_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes6.dex */
public final class CameraLogRecord {
    public static final String EVENT_CAMERA_PERFORMANCE = "CameraPerformance";
    public static final int TYPE_CAMERA1 = 1;
    public static final int TYPE_CAMERA2 = 2;
    public long autoFocusTime;
    public double fileSize;
    public long launchTime;
    public boolean manualFocus;
    public int module = 1;
    public long outputDataTime;
    public long shotTs;

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.module);
        bundle.putLong("key1", this.launchTime);
        bundle.putLong("key2", this.autoFocusTime);
        bundle.putLong("key3", this.outputDataTime);
        bundle.putBoolean("key4", this.manualFocus);
        bundle.putDouble(LogEventArguments.ARG_SIZE, this.fileSize);
        return bundle;
    }

    public String toString() {
        return "CameraLogRecord{module=" + this.module + ", launchTime=" + this.launchTime + ", outputDataTime=" + this.outputDataTime + ", fileSize=" + this.fileSize + ", shotTs=" + this.shotTs + '}';
    }
}
