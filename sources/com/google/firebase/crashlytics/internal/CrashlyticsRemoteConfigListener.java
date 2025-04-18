package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import e0.q;
import java.util.ArrayList;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes4.dex */
public final class CrashlyticsRemoteConfigListener implements RolloutsStateSubscriber {

    @NotNull
    private final UserMetadata userMetadata;

    public CrashlyticsRemoteConfigListener(@NotNull UserMetadata userMetadata) {
        a.s(userMetadata, "userMetadata");
        this.userMetadata = userMetadata;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber
    public void onRolloutsStateChanged(@NotNull RolloutsState rolloutsState) {
        a.s(rolloutsState, "rolloutsState");
        UserMetadata userMetadata = this.userMetadata;
        Set<RolloutAssignment> rolloutAssignments = rolloutsState.getRolloutAssignments();
        a.r(rolloutAssignments, "rolloutsState.rolloutAssignments");
        Set<RolloutAssignment> set = rolloutAssignments;
        ArrayList arrayList = new ArrayList(q.M(set, 10));
        for (RolloutAssignment rolloutAssignment : set) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.create(rolloutAssignment.getRolloutId(), rolloutAssignment.getParameterKey(), rolloutAssignment.getParameterValue(), rolloutAssignment.getVariantId(), rolloutAssignment.getTemplateVersion()));
        }
        userMetadata.updateRolloutsState(arrayList);
        Logger.getLogger().d("Updated Crashlytics Rollout State");
    }
}
