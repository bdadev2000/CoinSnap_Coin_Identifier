package com.vungle.ads.internal.task;

import android.os.Bundle;

/* loaded from: classes3.dex */
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

    public g(String str) {
        G7.j.e(str, "jobTag");
        this.jobTag = str;
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
            G7.j.c(clone, "null cannot be cast to non-null type com.vungle.ads.internal.task.JobInfo");
            return (g) clone;
        } catch (CloneNotSupportedException e4) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Cannot copy JobInfo " + this, e4);
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
        long j7 = this.rescheduleTimeout;
        if (j7 == 0) {
            return 0L;
        }
        long j9 = this.nextRescheduleTimeout;
        if (j9 == 0) {
            this.nextRescheduleTimeout = j7;
        } else if (this.reschedulePolicy == 1) {
            this.nextRescheduleTimeout = j9 * 2;
        }
        return this.nextRescheduleTimeout;
    }

    public final g setDelay(long j7) {
        this.delay = j7;
        return this;
    }

    public final g setExtras(Bundle bundle) {
        G7.j.e(bundle, "extras");
        this.extras = bundle;
        return this;
    }

    public final g setPriority(int i9) {
        this.priority = i9;
        return this;
    }

    public final g setRequiredNetworkType(int i9) {
        this.requiredNetworkType = i9;
        return this;
    }

    public final g setReschedulePolicy(long j7, int i9) {
        this.rescheduleTimeout = j7;
        this.reschedulePolicy = i9;
        return this;
    }

    public final g setUpdateCurrent(boolean z8) {
        this.updateCurrent = z8;
        return this;
    }
}
