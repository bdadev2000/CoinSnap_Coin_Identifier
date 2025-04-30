package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities;
import com.mbridge.msdk.playercommon.exoplayer2.RendererConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class MappingTrackSelector extends TrackSelector {
    private MappedTrackInfo currentMappedTrackInfo;

    private static int findRenderer(RendererCapabilities[] rendererCapabilitiesArr, TrackGroup trackGroup) throws ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        int i9 = 0;
        for (int i10 = 0; i10 < rendererCapabilitiesArr.length; i10++) {
            RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i10];
            for (int i11 = 0; i11 < trackGroup.length; i11++) {
                int supportsFormat = rendererCapabilities.supportsFormat(trackGroup.getFormat(i11)) & 7;
                if (supportsFormat > i9) {
                    if (supportsFormat == 4) {
                        return i10;
                    }
                    length = i10;
                    i9 = supportsFormat;
                }
            }
        }
        return length;
    }

    private static int[] getFormatSupport(RendererCapabilities rendererCapabilities, TrackGroup trackGroup) throws ExoPlaybackException {
        int[] iArr = new int[trackGroup.length];
        for (int i9 = 0; i9 < trackGroup.length; i9++) {
            iArr[i9] = rendererCapabilities.supportsFormat(trackGroup.getFormat(i9));
        }
        return iArr;
    }

    private static int[] getMixedMimeTypeAdaptationSupports(RendererCapabilities[] rendererCapabilitiesArr) throws ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = rendererCapabilitiesArr[i9].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    public final MappedTrackInfo getCurrentMappedTrackInfo() {
        return this.currentMappedTrackInfo;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelector
    public final void onSelectionActivated(Object obj) {
        this.currentMappedTrackInfo = (MappedTrackInfo) obj;
    }

    public abstract Pair<RendererConfiguration[], TrackSelection[]> selectTracks(MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2) throws ExoPlaybackException;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelector
    public final TrackSelectorResult selectTracks(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray) throws ExoPlaybackException {
        int[] iArr = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length];
        int[][][] iArr2 = new int[rendererCapabilitiesArr.length + 1][];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = trackGroupArray.length;
            trackGroupArr[i9] = new TrackGroup[i10];
            iArr2[i9] = new int[i10];
        }
        int[] mixedMimeTypeAdaptationSupports = getMixedMimeTypeAdaptationSupports(rendererCapabilitiesArr);
        for (int i11 = 0; i11 < trackGroupArray.length; i11++) {
            TrackGroup trackGroup = trackGroupArray.get(i11);
            int findRenderer = findRenderer(rendererCapabilitiesArr, trackGroup);
            int[] formatSupport = findRenderer == rendererCapabilitiesArr.length ? new int[trackGroup.length] : getFormatSupport(rendererCapabilitiesArr[findRenderer], trackGroup);
            int i12 = iArr[findRenderer];
            trackGroupArr[findRenderer][i12] = trackGroup;
            iArr2[findRenderer][i12] = formatSupport;
            iArr[findRenderer] = i12 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        int[] iArr3 = new int[rendererCapabilitiesArr.length];
        for (int i13 = 0; i13 < rendererCapabilitiesArr.length; i13++) {
            int i14 = iArr[i13];
            trackGroupArrayArr[i13] = new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[i13], i14));
            iArr2[i13] = (int[][]) Util.nullSafeArrayCopy(iArr2[i13], i14);
            iArr3[i13] = rendererCapabilitiesArr[i13].getTrackType();
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(iArr3, trackGroupArrayArr, mixedMimeTypeAdaptationSupports, iArr2, new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[rendererCapabilitiesArr.length], iArr[rendererCapabilitiesArr.length])));
        Pair<RendererConfiguration[], TrackSelection[]> selectTracks = selectTracks(mappedTrackInfo, iArr2, mixedMimeTypeAdaptationSupports);
        return new TrackSelectorResult((RendererConfiguration[]) selectTracks.first, (TrackSelection[]) selectTracks.second, mappedTrackInfo);
    }

    /* loaded from: classes3.dex */
    public static final class MappedTrackInfo {
        public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
        public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
        public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
        public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;
        public final int length;
        private final int rendererCount;
        private final int[][][] rendererFormatSupports;
        private final int[] rendererMixedMimeTypeAdaptiveSupports;
        private final TrackGroupArray[] rendererTrackGroups;
        private final int[] rendererTrackTypes;
        private final TrackGroupArray unmappedTrackGroups;

        /* loaded from: classes3.dex */
        public @interface RendererSupport {
        }

        public MappedTrackInfo(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.rendererTrackTypes = iArr;
            this.rendererTrackGroups = trackGroupArrayArr;
            this.rendererFormatSupports = iArr3;
            this.rendererMixedMimeTypeAdaptiveSupports = iArr2;
            this.unmappedTrackGroups = trackGroupArray;
            int length = iArr.length;
            this.rendererCount = length;
            this.length = length;
        }

        public final int getAdaptiveSupport(int i9, int i10, boolean z8) {
            int i11 = this.rendererTrackGroups[i9].get(i10).length;
            int[] iArr = new int[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                int trackSupport = getTrackSupport(i9, i10, i13);
                if (trackSupport == 4 || (z8 && trackSupport == 3)) {
                    iArr[i12] = i13;
                    i12++;
                }
            }
            return getAdaptiveSupport(i9, i10, Arrays.copyOf(iArr, i12));
        }

        public final int getRendererCount() {
            return this.rendererCount;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
        
            r1 = r1 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int getRendererSupport(int r8) {
            /*
                r7 = this;
                int[][][] r0 = r7.rendererFormatSupports
                r8 = r0[r8]
                r0 = 0
                r1 = r0
                r2 = r1
            L7:
                int r3 = r8.length
                if (r1 >= r3) goto L28
                r3 = r0
            Lb:
                r4 = r8[r1]
                int r5 = r4.length
                if (r3 >= r5) goto L25
                r4 = r4[r3]
                r4 = r4 & 7
                r5 = 3
                if (r4 == r5) goto L1d
                r6 = 4
                if (r4 == r6) goto L1c
                r4 = 1
                goto L1e
            L1c:
                return r5
            L1d:
                r4 = 2
            L1e:
                int r2 = java.lang.Math.max(r2, r4)
                int r3 = r3 + 1
                goto Lb
            L25:
                int r1 = r1 + 1
                goto L7
            L28:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo.getRendererSupport(int):int");
        }

        public final int getRendererType(int i9) {
            return this.rendererTrackTypes[i9];
        }

        public final int getTrackFormatSupport(int i9, int i10, int i11) {
            return getTrackSupport(i9, i10, i11);
        }

        public final TrackGroupArray getTrackGroups(int i9) {
            return this.rendererTrackGroups[i9];
        }

        public final int getTrackSupport(int i9, int i10, int i11) {
            return this.rendererFormatSupports[i9][i10][i11] & 7;
        }

        public final int getTrackTypeRendererSupport(int i9) {
            return getTypeSupport(i9);
        }

        public final int getTypeSupport(int i9) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.rendererCount; i11++) {
                if (this.rendererTrackTypes[i11] == i9) {
                    i10 = Math.max(i10, getRendererSupport(i11));
                }
            }
            return i10;
        }

        public final TrackGroupArray getUnassociatedTrackGroups() {
            return getUnmappedTrackGroups();
        }

        public final TrackGroupArray getUnmappedTrackGroups() {
            return this.unmappedTrackGroups;
        }

        public final int getAdaptiveSupport(int i9, int i10, int[] iArr) {
            int i11 = 0;
            int i12 = 16;
            String str = null;
            boolean z8 = false;
            int i13 = 0;
            while (i11 < iArr.length) {
                String str2 = this.rendererTrackGroups[i9].get(i10).getFormat(iArr[i11]).sampleMimeType;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z8 |= !Util.areEqual(str, str2);
                }
                i12 = Math.min(i12, this.rendererFormatSupports[i9][i10][i11] & 24);
                i11++;
                i13 = i14;
            }
            return z8 ? Math.min(i12, this.rendererMixedMimeTypeAdaptiveSupports[i9]) : i12;
        }
    }
}
