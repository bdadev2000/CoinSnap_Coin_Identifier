package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import com.mbridge.msdk.playercommon.exoplayer2.RendererConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class TrackSelectorResult {
    public final Object info;
    public final int length;
    public final RendererConfiguration[] rendererConfigurations;
    public final TrackSelectionArray selections;

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, TrackSelection[] trackSelectionArr, Object obj) {
        this.rendererConfigurations = rendererConfigurationArr;
        this.selections = new TrackSelectionArray(trackSelectionArr);
        this.info = obj;
        this.length = rendererConfigurationArr.length;
    }

    public final boolean isEquivalent(TrackSelectorResult trackSelectorResult) {
        if (trackSelectorResult == null || trackSelectorResult.selections.length != this.selections.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.selections.length; i10++) {
            if (!isEquivalent(trackSelectorResult, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isRendererEnabled(int i10) {
        return this.rendererConfigurations[i10] != null;
    }

    public final boolean isEquivalent(TrackSelectorResult trackSelectorResult, int i10) {
        return trackSelectorResult != null && Util.areEqual(this.rendererConfigurations[i10], trackSelectorResult.rendererConfigurations[i10]) && Util.areEqual(this.selections.get(i10), trackSelectorResult.selections.get(i10));
    }
}
