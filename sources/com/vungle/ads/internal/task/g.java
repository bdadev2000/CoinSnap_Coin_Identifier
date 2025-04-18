package com.vungle.ads.internal.task;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements Cloneable {
    public static final f Companion = new f(null);
    private static final String TAG = "JobInfo";
    private long delay;
    private Bundle extras;
    private final String jobTag;
    private long nextRescheduleTimeout;
    private int priority;
    private int requiredNetworkType;
    private int reschedulePolicy;
    private long rescheduleTimeout;
    private boolean updateCurrent;

    public g(String jobTag) {
        Intrinsics.checkNotNullParameter(jobTag, "jobTag");
        this.jobTag = jobTag;
        this.extras = new Bundle();
        this.reschedulePolicy = 1;
        this.priority = 2;
    }

    public static /* synthetic */ void getPriority$annotations() {
    }

    public static /* synthetic */ void getRequiredNetworkType$annotations() {
    }

    private static /* synthetic */ void getReschedulePolicy$annotations() {
    }

    public Object clone() {
        return super.clone();
    }

    public final g copy() {
        try {
            Object clone = super.clone();
            Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type com.vungle.ads.internal.task.JobInfo");
            return (g) clone;
        } catch (CloneNotSupportedException e2) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Cannot copy JobInfo " + this, e2);
            return null;
        }
    }

    public final long getDelay() {
        return this.delay;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final String getJobTag() {
        return this.jobTag;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final boolean getUpdateCurrent() {
        return this.updateCurrent;
    }

    public final long makeNextRescedule() {
        long j3 = this.rescheduleTimeout;
        if (j3 == 0) {
            return 0L;
        }
        long j10 = this.nextRescheduleTimeout;
        if (j10 == 0) {
            this.nextRescheduleTimeout = j3;
        } else if (this.reschedulePolicy == 1) {
            this.nextRescheduleTimeout = j10 * 2;
        }
        return this.nextRescheduleTimeout;
    }

    public final g setDelay(long j3) {
        this.delay = j3;
        return this;
    }

    public final g setExtras(Bundle extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.extras = extras;
        return this;
    }

    public final g setPriority(int i10) {
        this.priority = i10;
        return this;
    }

    public final g setRequiredNetworkType(int i10) {
        this.requiredNetworkType = i10;
        return this;
    }

    public final g setReschedulePolicy(long j3, int i10) {
        this.rescheduleTimeout = j3;
        this.reschedulePolicy = i10;
        return this;
    }

    public final g setUpdateCurrent(boolean z10) {
        this.updateCurrent = z10;
        return this;
    }
}
