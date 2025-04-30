package com.google.ar.core;

import androidx.annotation.NonNull;
import java.util.Collection;

/* loaded from: classes2.dex */
public interface Trackable {
    @NonNull
    Anchor createAnchor(Pose pose);

    @NonNull
    Collection<Anchor> getAnchors();

    @NonNull
    TrackingState getTrackingState();
}
