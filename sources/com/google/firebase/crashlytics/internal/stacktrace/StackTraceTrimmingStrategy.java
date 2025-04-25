package com.google.firebase.crashlytics.internal.stacktrace;

/* loaded from: classes11.dex */
public interface StackTraceTrimmingStrategy {
    StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr);
}
