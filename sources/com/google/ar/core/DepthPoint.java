package com.google.ar.core;

import androidx.annotation.NonNull;
import java.util.Collection;

/* loaded from: classes2.dex */
public class DepthPoint extends TrackableBase {
    public DepthPoint(long j7, Session session) {
        super(j7, session);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    @NonNull
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    @NonNull
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    @NonNull
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }
}
