package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import com.mbridge.msdk.playercommon.exoplayer2.RendererConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes3.dex */
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
        for (int i9 = 0; i9 < this.selections.length; i9++) {
            if (!isEquivalent(trackSelectorResult, i9)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isRendererEnabled(int i9) {
        if (this.rendererConfigurations[i9] != null) {
            return true;
        }
        return false;
    }

    public final boolean isEquivalent(TrackSelectorResult trackSelectorResult, int i9) {
        return trackSelectorResult != null && Util.areEqual(this.rendererConfigurations[i9], trackSelectorResult.rendererConfigurations[i9]) && Util.areEqual(this.selections.get(i9), trackSelectorResult.selections.get(i9));
    }
}
