package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.RendererConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.MappingTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class DefaultTrackSelector extends MappingTrackSelector {
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    private static final int[] NO_TRACKS = new int[0];
    private static final int WITHIN_RENDERER_CAPABILITIES_BONUS = 1000;
    private final TrackSelection.Factory adaptiveTrackSelectionFactory;
    private final AtomicReference<Parameters> parametersReference;

    /* loaded from: classes3.dex */
    public static final class AudioConfigurationTuple {
        public final int channelCount;
        public final String mimeType;
        public final int sampleRate;

        public AudioConfigurationTuple(int i9, int i10, String str) {
            this.channelCount = i9;
            this.sampleRate = i10;
            this.mimeType = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AudioConfigurationTuple.class != obj.getClass()) {
                return false;
            }
            AudioConfigurationTuple audioConfigurationTuple = (AudioConfigurationTuple) obj;
            if (this.channelCount == audioConfigurationTuple.channelCount && this.sampleRate == audioConfigurationTuple.sampleRate && TextUtils.equals(this.mimeType, audioConfigurationTuple.mimeType)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i9;
            int i10 = ((this.channelCount * 31) + this.sampleRate) * 31;
            String str = this.mimeType;
            if (str != null) {
                i9 = str.hashCode();
            } else {
                i9 = 0;
            }
            return i10 + i9;
        }
    }

    /* loaded from: classes3.dex */
    public static final class AudioTrackScore implements Comparable<AudioTrackScore> {
        private final int bitrate;
        private final int channelCount;
        private final int defaultSelectionFlagScore;
        private final int matchLanguageScore;
        private final Parameters parameters;
        private final int sampleRate;
        private final int withinRendererCapabilitiesScore;

        public AudioTrackScore(Format format, Parameters parameters, int i9) {
            this.parameters = parameters;
            this.withinRendererCapabilitiesScore = DefaultTrackSelector.isSupported(i9, false) ? 1 : 0;
            this.matchLanguageScore = DefaultTrackSelector.formatHasLanguage(format, parameters.preferredAudioLanguage) ? 1 : 0;
            this.defaultSelectionFlagScore = (format.selectionFlags & 1) != 0 ? 1 : 0;
            this.channelCount = format.channelCount;
            this.sampleRate = format.sampleRate;
            this.bitrate = format.bitrate;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AudioTrackScore.class != obj.getClass()) {
                return false;
            }
            AudioTrackScore audioTrackScore = (AudioTrackScore) obj;
            if (this.withinRendererCapabilitiesScore == audioTrackScore.withinRendererCapabilitiesScore && this.matchLanguageScore == audioTrackScore.matchLanguageScore && this.defaultSelectionFlagScore == audioTrackScore.defaultSelectionFlagScore && this.channelCount == audioTrackScore.channelCount && this.sampleRate == audioTrackScore.sampleRate && this.bitrate == audioTrackScore.bitrate) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((((((((this.withinRendererCapabilitiesScore * 31) + this.matchLanguageScore) * 31) + this.defaultSelectionFlagScore) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.bitrate;
        }

        @Override // java.lang.Comparable
        public final int compareTo(AudioTrackScore audioTrackScore) {
            int i9 = this.withinRendererCapabilitiesScore;
            int i10 = audioTrackScore.withinRendererCapabilitiesScore;
            if (i9 != i10) {
                return DefaultTrackSelector.compareInts(i9, i10);
            }
            int i11 = this.matchLanguageScore;
            int i12 = audioTrackScore.matchLanguageScore;
            if (i11 != i12) {
                return DefaultTrackSelector.compareInts(i11, i12);
            }
            int i13 = this.defaultSelectionFlagScore;
            int i14 = audioTrackScore.defaultSelectionFlagScore;
            if (i13 != i14) {
                return DefaultTrackSelector.compareInts(i13, i14);
            }
            if (this.parameters.forceLowestBitrate) {
                return DefaultTrackSelector.compareInts(audioTrackScore.bitrate, this.bitrate);
            }
            int i15 = i9 != 1 ? -1 : 1;
            int i16 = this.channelCount;
            int i17 = audioTrackScore.channelCount;
            if (i16 != i17) {
                return DefaultTrackSelector.compareInts(i16, i17) * i15;
            }
            int i18 = this.sampleRate;
            int i19 = audioTrackScore.sampleRate;
            return i18 != i19 ? DefaultTrackSelector.compareInts(i18, i19) * i15 : DefaultTrackSelector.compareInts(this.bitrate, audioTrackScore.bitrate) * i15;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Parameters implements Parcelable {
        public final boolean allowMixedMimeAdaptiveness;
        public final boolean allowNonSeamlessAdaptiveness;
        public final int disabledTextTrackSelectionFlags;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        public final boolean forceLowestBitrate;
        public final int maxVideoBitrate;
        public final int maxVideoHeight;
        public final int maxVideoWidth;
        public final String preferredAudioLanguage;
        public final String preferredTextLanguage;
        private final SparseBooleanArray rendererDisabledFlags;
        public final boolean selectUndeterminedTextLanguage;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final int tunnelingAudioSessionId;
        public final int viewportHeight;
        public final boolean viewportOrientationMayChange;
        public final int viewportWidth;
        public static final Parameters DEFAULT = new Parameters();
        public static final Parcelable.Creator<Parameters> CREATOR = new Parcelable.Creator<Parameters>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.Parameters.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Parameters createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Parameters[] newArray(int i9) {
                return new Parameters[i9];
            }
        };

        private Parameters() {
            this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i9 = 0; i9 < size; i9++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i9)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i9 = 0; i9 < size; i9++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i9));
                if (indexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i9), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> readSelectionOverrides(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(readInt);
            for (int i9 = 0; i9 < readInt; i9++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i10 = 0; i10 < readInt3; i10++) {
                    hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        private static void writeSelectionOverridesToParcel(Parcel parcel, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i9 = 0; i9 < size; i9++) {
                int keyAt = sparseArray.keyAt(i9);
                Map<TrackGroupArray, SelectionOverride> valueAt = sparseArray.valueAt(i9);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        public final ParametersBuilder buildUpon() {
            return new ParametersBuilder(this);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Parameters.class != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            if (this.selectUndeterminedTextLanguage == parameters.selectUndeterminedTextLanguage && this.disabledTextTrackSelectionFlags == parameters.disabledTextTrackSelectionFlags && this.forceLowestBitrate == parameters.forceLowestBitrate && this.allowMixedMimeAdaptiveness == parameters.allowMixedMimeAdaptiveness && this.allowNonSeamlessAdaptiveness == parameters.allowNonSeamlessAdaptiveness && this.maxVideoWidth == parameters.maxVideoWidth && this.maxVideoHeight == parameters.maxVideoHeight && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.viewportOrientationMayChange == parameters.viewportOrientationMayChange && this.viewportWidth == parameters.viewportWidth && this.viewportHeight == parameters.viewportHeight && this.maxVideoBitrate == parameters.maxVideoBitrate && this.tunnelingAudioSessionId == parameters.tunnelingAudioSessionId && TextUtils.equals(this.preferredAudioLanguage, parameters.preferredAudioLanguage) && TextUtils.equals(this.preferredTextLanguage, parameters.preferredTextLanguage) && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides)) {
                return true;
            }
            return false;
        }

        public final boolean getRendererDisabled(int i9) {
            return this.rendererDisabledFlags.get(i9);
        }

        public final SelectionOverride getSelectionOverride(int i9, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i9);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        public final boolean hasSelectionOverride(int i9, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i9);
            if (map != null && map.containsKey(trackGroupArray)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i9 = (((((((((((((((((((((((((((this.selectUndeterminedTextLanguage ? 1 : 0) * 31) + this.disabledTextTrackSelectionFlags) * 31) + (this.forceLowestBitrate ? 1 : 0)) * 31) + (this.allowMixedMimeAdaptiveness ? 1 : 0)) * 31) + (this.allowNonSeamlessAdaptiveness ? 1 : 0)) * 31) + this.maxVideoWidth) * 31) + this.maxVideoHeight) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.viewportOrientationMayChange ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight) * 31) + this.maxVideoBitrate) * 31) + this.tunnelingAudioSessionId) * 31;
            String str = this.preferredAudioLanguage;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (i9 + hashCode) * 31;
            String str2 = this.preferredTextLanguage;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return i11 + i10;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i9) {
            writeSelectionOverridesToParcel(parcel, this.selectionOverrides);
            parcel.writeSparseBooleanArray(this.rendererDisabledFlags);
            parcel.writeString(this.preferredAudioLanguage);
            parcel.writeString(this.preferredTextLanguage);
            Util.writeBoolean(parcel, this.selectUndeterminedTextLanguage);
            parcel.writeInt(this.disabledTextTrackSelectionFlags);
            Util.writeBoolean(parcel, this.forceLowestBitrate);
            Util.writeBoolean(parcel, this.allowMixedMimeAdaptiveness);
            Util.writeBoolean(parcel, this.allowNonSeamlessAdaptiveness);
            parcel.writeInt(this.maxVideoWidth);
            parcel.writeInt(this.maxVideoHeight);
            parcel.writeInt(this.maxVideoBitrate);
            Util.writeBoolean(parcel, this.exceedVideoConstraintsIfNecessary);
            Util.writeBoolean(parcel, this.exceedRendererCapabilitiesIfNecessary);
            parcel.writeInt(this.viewportWidth);
            parcel.writeInt(this.viewportHeight);
            Util.writeBoolean(parcel, this.viewportOrientationMayChange);
            parcel.writeInt(this.tunnelingAudioSessionId);
        }

        public Parameters(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z8, int i9, boolean z9, boolean z10, boolean z11, int i10, int i11, int i12, boolean z12, boolean z13, int i13, int i14, boolean z14, int i15) {
            this.selectionOverrides = sparseArray;
            this.rendererDisabledFlags = sparseBooleanArray;
            this.preferredAudioLanguage = Util.normalizeLanguageCode(str);
            this.preferredTextLanguage = Util.normalizeLanguageCode(str2);
            this.selectUndeterminedTextLanguage = z8;
            this.disabledTextTrackSelectionFlags = i9;
            this.forceLowestBitrate = z9;
            this.allowMixedMimeAdaptiveness = z10;
            this.allowNonSeamlessAdaptiveness = z11;
            this.maxVideoWidth = i10;
            this.maxVideoHeight = i11;
            this.maxVideoBitrate = i12;
            this.exceedVideoConstraintsIfNecessary = z12;
            this.exceedRendererCapabilitiesIfNecessary = z13;
            this.viewportWidth = i13;
            this.viewportHeight = i14;
            this.viewportOrientationMayChange = z14;
            this.tunnelingAudioSessionId = i15;
        }

        private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !Util.areEqual(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public Parameters(Parcel parcel) {
            this.selectionOverrides = readSelectionOverrides(parcel);
            this.rendererDisabledFlags = parcel.readSparseBooleanArray();
            this.preferredAudioLanguage = parcel.readString();
            this.preferredTextLanguage = parcel.readString();
            this.selectUndeterminedTextLanguage = Util.readBoolean(parcel);
            this.disabledTextTrackSelectionFlags = parcel.readInt();
            this.forceLowestBitrate = Util.readBoolean(parcel);
            this.allowMixedMimeAdaptiveness = Util.readBoolean(parcel);
            this.allowNonSeamlessAdaptiveness = Util.readBoolean(parcel);
            this.maxVideoWidth = parcel.readInt();
            this.maxVideoHeight = parcel.readInt();
            this.maxVideoBitrate = parcel.readInt();
            this.exceedVideoConstraintsIfNecessary = Util.readBoolean(parcel);
            this.exceedRendererCapabilitiesIfNecessary = Util.readBoolean(parcel);
            this.viewportWidth = parcel.readInt();
            this.viewportHeight = parcel.readInt();
            this.viewportOrientationMayChange = Util.readBoolean(parcel);
            this.tunnelingAudioSessionId = parcel.readInt();
        }
    }

    /* loaded from: classes3.dex */
    public static final class ParametersBuilder {
        private boolean allowMixedMimeAdaptiveness;
        private boolean allowNonSeamlessAdaptiveness;
        private int disabledTextTrackSelectionFlags;
        private boolean exceedRendererCapabilitiesIfNecessary;
        private boolean exceedVideoConstraintsIfNecessary;
        private boolean forceLowestBitrate;
        private int maxVideoBitrate;
        private int maxVideoHeight;
        private int maxVideoWidth;
        private String preferredAudioLanguage;
        private String preferredTextLanguage;
        private final SparseBooleanArray rendererDisabledFlags;
        private boolean selectUndeterminedTextLanguage;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        private int tunnelingAudioSessionId;
        private int viewportHeight;
        private boolean viewportOrientationMayChange;
        private int viewportWidth;

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
            for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                sparseArray2.put(sparseArray.keyAt(i9), new HashMap(sparseArray.valueAt(i9)));
            }
            return sparseArray2;
        }

        public final Parameters build() {
            return new Parameters(this.selectionOverrides, this.rendererDisabledFlags, this.preferredAudioLanguage, this.preferredTextLanguage, this.selectUndeterminedTextLanguage, this.disabledTextTrackSelectionFlags, this.forceLowestBitrate, this.allowMixedMimeAdaptiveness, this.allowNonSeamlessAdaptiveness, this.maxVideoWidth, this.maxVideoHeight, this.maxVideoBitrate, this.exceedVideoConstraintsIfNecessary, this.exceedRendererCapabilitiesIfNecessary, this.viewportWidth, this.viewportHeight, this.viewportOrientationMayChange, this.tunnelingAudioSessionId);
        }

        public final ParametersBuilder clearSelectionOverride(int i9, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i9);
            if (map != null && map.containsKey(trackGroupArray)) {
                map.remove(trackGroupArray);
                if (map.isEmpty()) {
                    this.selectionOverrides.remove(i9);
                }
            }
            return this;
        }

        public final ParametersBuilder clearSelectionOverrides(int i9) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i9);
            if (map != null && !map.isEmpty()) {
                this.selectionOverrides.remove(i9);
            }
            return this;
        }

        public final ParametersBuilder clearVideoSizeConstraints() {
            return setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public final ParametersBuilder clearViewportSizeConstraints() {
            return setViewportSize(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public final ParametersBuilder setAllowMixedMimeAdaptiveness(boolean z8) {
            this.allowMixedMimeAdaptiveness = z8;
            return this;
        }

        public final ParametersBuilder setAllowNonSeamlessAdaptiveness(boolean z8) {
            this.allowNonSeamlessAdaptiveness = z8;
            return this;
        }

        public final ParametersBuilder setDisabledTextTrackSelectionFlags(int i9) {
            this.disabledTextTrackSelectionFlags = i9;
            return this;
        }

        public final ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z8) {
            this.exceedRendererCapabilitiesIfNecessary = z8;
            return this;
        }

        public final ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z8) {
            this.exceedVideoConstraintsIfNecessary = z8;
            return this;
        }

        public final ParametersBuilder setForceLowestBitrate(boolean z8) {
            this.forceLowestBitrate = z8;
            return this;
        }

        public final ParametersBuilder setMaxVideoBitrate(int i9) {
            this.maxVideoBitrate = i9;
            return this;
        }

        public final ParametersBuilder setMaxVideoSize(int i9, int i10) {
            this.maxVideoWidth = i9;
            this.maxVideoHeight = i10;
            return this;
        }

        public final ParametersBuilder setMaxVideoSizeSd() {
            return setMaxVideoSize(1279, 719);
        }

        public final ParametersBuilder setPreferredAudioLanguage(String str) {
            this.preferredAudioLanguage = str;
            return this;
        }

        public final ParametersBuilder setPreferredTextLanguage(String str) {
            this.preferredTextLanguage = str;
            return this;
        }

        public final ParametersBuilder setRendererDisabled(int i9, boolean z8) {
            if (this.rendererDisabledFlags.get(i9) == z8) {
                return this;
            }
            if (z8) {
                this.rendererDisabledFlags.put(i9, true);
            } else {
                this.rendererDisabledFlags.delete(i9);
            }
            return this;
        }

        public final ParametersBuilder setSelectUndeterminedTextLanguage(boolean z8) {
            this.selectUndeterminedTextLanguage = z8;
            return this;
        }

        public final ParametersBuilder setSelectionOverride(int i9, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i9);
            if (map == null) {
                map = new HashMap<>();
                this.selectionOverrides.put(i9, map);
            }
            if (map.containsKey(trackGroupArray) && Util.areEqual(map.get(trackGroupArray), selectionOverride)) {
                return this;
            }
            map.put(trackGroupArray, selectionOverride);
            return this;
        }

        public final ParametersBuilder setTunnelingAudioSessionId(int i9) {
            if (this.tunnelingAudioSessionId != i9) {
                this.tunnelingAudioSessionId = i9;
            }
            return this;
        }

        public final ParametersBuilder setViewportSize(int i9, int i10, boolean z8) {
            this.viewportWidth = i9;
            this.viewportHeight = i10;
            this.viewportOrientationMayChange = z8;
            return this;
        }

        public final ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean z8) {
            Point physicalDisplaySize = Util.getPhysicalDisplaySize(context);
            return setViewportSize(physicalDisplaySize.x, physicalDisplaySize.y, z8);
        }

        public ParametersBuilder() {
            this(Parameters.DEFAULT);
        }

        private ParametersBuilder(Parameters parameters) {
            this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
            this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
            this.preferredAudioLanguage = parameters.preferredAudioLanguage;
            this.preferredTextLanguage = parameters.preferredTextLanguage;
            this.selectUndeterminedTextLanguage = parameters.selectUndeterminedTextLanguage;
            this.disabledTextTrackSelectionFlags = parameters.disabledTextTrackSelectionFlags;
            this.forceLowestBitrate = parameters.forceLowestBitrate;
            this.allowMixedMimeAdaptiveness = parameters.allowMixedMimeAdaptiveness;
            this.allowNonSeamlessAdaptiveness = parameters.allowNonSeamlessAdaptiveness;
            this.maxVideoWidth = parameters.maxVideoWidth;
            this.maxVideoHeight = parameters.maxVideoHeight;
            this.maxVideoBitrate = parameters.maxVideoBitrate;
            this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
            this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
            this.viewportWidth = parameters.viewportWidth;
            this.viewportHeight = parameters.viewportHeight;
            this.viewportOrientationMayChange = parameters.viewportOrientationMayChange;
            this.tunnelingAudioSessionId = parameters.tunnelingAudioSessionId;
        }

        public final ParametersBuilder clearSelectionOverrides() {
            if (this.selectionOverrides.size() == 0) {
                return this;
            }
            this.selectionOverrides.clear();
            return this;
        }
    }

    public DefaultTrackSelector() {
        this((TrackSelection.Factory) null);
    }

    private static int compareFormatValues(int i9, int i10) {
        if (i9 == -1) {
            return i10 == -1 ? 0 : -1;
        }
        if (i10 == -1) {
            return 1;
        }
        return i9 - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareInts(int i9, int i10) {
        if (i9 > i10) {
            return 1;
        }
        return i10 > i9 ? -1 : 0;
    }

    private static void filterAdaptiveVideoTrackCountForMimeType(TrackGroup trackGroup, int[] iArr, int i9, String str, int i10, int i11, int i12, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!isSupportedAdaptiveVideoTrack(trackGroup.getFormat(intValue), str, iArr[intValue], i9, i10, i11, i12)) {
                list.remove(size);
            }
        }
    }

    public static boolean formatHasLanguage(Format format, String str) {
        if (str != null && TextUtils.equals(str, Util.normalizeLanguageCode(format.language))) {
            return true;
        }
        return false;
    }

    public static boolean formatHasNoLanguage(Format format) {
        if (!TextUtils.isEmpty(format.language) && !formatHasLanguage(format, C.LANGUAGE_UNDETERMINED)) {
            return false;
        }
        return true;
    }

    private static int getAdaptiveAudioTrackCount(TrackGroup trackGroup, int[] iArr, AudioConfigurationTuple audioConfigurationTuple) {
        int i9 = 0;
        for (int i10 = 0; i10 < trackGroup.length; i10++) {
            if (isSupportedAdaptiveAudioTrack(trackGroup.getFormat(i10), iArr[i10], audioConfigurationTuple)) {
                i9++;
            }
        }
        return i9;
    }

    private static int[] getAdaptiveAudioTracks(TrackGroup trackGroup, int[] iArr, boolean z8) {
        String str;
        int adaptiveAudioTrackCount;
        HashSet hashSet = new HashSet();
        int i9 = 0;
        AudioConfigurationTuple audioConfigurationTuple = null;
        for (int i10 = 0; i10 < trackGroup.length; i10++) {
            Format format = trackGroup.getFormat(i10);
            int i11 = format.channelCount;
            int i12 = format.sampleRate;
            if (z8) {
                str = null;
            } else {
                str = format.sampleMimeType;
            }
            AudioConfigurationTuple audioConfigurationTuple2 = new AudioConfigurationTuple(i11, i12, str);
            if (hashSet.add(audioConfigurationTuple2) && (adaptiveAudioTrackCount = getAdaptiveAudioTrackCount(trackGroup, iArr, audioConfigurationTuple2)) > i9) {
                i9 = adaptiveAudioTrackCount;
                audioConfigurationTuple = audioConfigurationTuple2;
            }
        }
        if (i9 > 1) {
            int[] iArr2 = new int[i9];
            int i13 = 0;
            for (int i14 = 0; i14 < trackGroup.length; i14++) {
                if (isSupportedAdaptiveAudioTrack(trackGroup.getFormat(i14), iArr[i14], (AudioConfigurationTuple) Assertions.checkNotNull(audioConfigurationTuple))) {
                    iArr2[i13] = i14;
                    i13++;
                }
            }
            return iArr2;
        }
        return NO_TRACKS;
    }

    private static int getAdaptiveVideoTrackCountForMimeType(TrackGroup trackGroup, int[] iArr, int i9, String str, int i10, int i11, int i12, List<Integer> list) {
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            int intValue = list.get(i14).intValue();
            if (isSupportedAdaptiveVideoTrack(trackGroup.getFormat(intValue), str, iArr[intValue], i9, i10, i11, i12)) {
                i13++;
            }
        }
        return i13;
    }

    private static int[] getAdaptiveVideoTracksForGroup(TrackGroup trackGroup, int[] iArr, boolean z8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z9) {
        String str;
        int adaptiveVideoTrackCountForMimeType;
        if (trackGroup.length < 2) {
            return NO_TRACKS;
        }
        List<Integer> viewportFilteredTrackIndices = getViewportFilteredTrackIndices(trackGroup, i13, i14, z9);
        if (viewportFilteredTrackIndices.size() < 2) {
            return NO_TRACKS;
        }
        if (!z8) {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i15 = 0;
            for (int i16 = 0; i16 < viewportFilteredTrackIndices.size(); i16++) {
                String str3 = trackGroup.getFormat(viewportFilteredTrackIndices.get(i16).intValue()).sampleMimeType;
                if (hashSet.add(str3) && (adaptiveVideoTrackCountForMimeType = getAdaptiveVideoTrackCountForMimeType(trackGroup, iArr, i9, str3, i10, i11, i12, viewportFilteredTrackIndices)) > i15) {
                    i15 = adaptiveVideoTrackCountForMimeType;
                    str2 = str3;
                }
            }
            str = str2;
        } else {
            str = null;
        }
        filterAdaptiveVideoTrackCountForMimeType(trackGroup, iArr, i9, str, i10, i11, i12, viewportFilteredTrackIndices);
        if (viewportFilteredTrackIndices.size() < 2) {
            return NO_TRACKS;
        }
        return Util.toArray(viewportFilteredTrackIndices);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r1 != r3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point getMaxVideoSizeInViewport(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.ceilDivide(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.ceilDivide(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.getMaxVideoSizeInViewport(boolean, int, int, int, int):android.graphics.Point");
    }

    private static List<Integer> getViewportFilteredTrackIndices(TrackGroup trackGroup, int i9, int i10, boolean z8) {
        int i11;
        ArrayList arrayList = new ArrayList(trackGroup.length);
        for (int i12 = 0; i12 < trackGroup.length; i12++) {
            arrayList.add(Integer.valueOf(i12));
        }
        if (i9 != Integer.MAX_VALUE && i10 != Integer.MAX_VALUE) {
            int i13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < trackGroup.length; i14++) {
                Format format = trackGroup.getFormat(i14);
                int i15 = format.width;
                if (i15 > 0 && (i11 = format.height) > 0) {
                    Point maxVideoSizeInViewport = getMaxVideoSizeInViewport(z8, i9, i10, i15, i11);
                    int i16 = format.width;
                    int i17 = format.height;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && i17 >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
            if (i13 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int pixelCount = trackGroup.getFormat(((Integer) arrayList.get(size)).intValue()).getPixelCount();
                    if (pixelCount == -1 || pixelCount > i13) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean isSupported(int i9, boolean z8) {
        int i10 = i9 & 7;
        return i10 == 4 || (z8 && i10 == 3);
    }

    private static boolean isSupportedAdaptiveAudioTrack(Format format, int i9, AudioConfigurationTuple audioConfigurationTuple) {
        if (!isSupported(i9, false) || format.channelCount != audioConfigurationTuple.channelCount || format.sampleRate != audioConfigurationTuple.sampleRate) {
            return false;
        }
        String str = audioConfigurationTuple.mimeType;
        if (str != null && !TextUtils.equals(str, format.sampleMimeType)) {
            return false;
        }
        return true;
    }

    private static boolean isSupportedAdaptiveVideoTrack(Format format, String str, int i9, int i10, int i11, int i12, int i13) {
        if (!isSupported(i9, false) || (i9 & i10) == 0) {
            return false;
        }
        if (str != null && !Util.areEqual(format.sampleMimeType, str)) {
            return false;
        }
        int i14 = format.width;
        if (i14 != -1 && i14 > i11) {
            return false;
        }
        int i15 = format.height;
        if (i15 != -1 && i15 > i12) {
            return false;
        }
        int i16 = format.bitrate;
        if (i16 != -1 && i16 > i13) {
            return false;
        }
        return true;
    }

    private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, TrackSelection[] trackSelectionArr, int i9) {
        boolean z8;
        if (i9 == 0) {
            return;
        }
        boolean z9 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < mappedTrackInfo.getRendererCount(); i12++) {
            int rendererType = mappedTrackInfo.getRendererType(i12);
            TrackSelection trackSelection = trackSelectionArr[i12];
            if ((rendererType == 1 || rendererType == 2) && trackSelection != null && rendererSupportsTunneling(iArr[i12], mappedTrackInfo.getTrackGroups(i12), trackSelection)) {
                if (rendererType == 1) {
                    if (i11 != -1) {
                        z8 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z8 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z8 = true;
        if (i11 != -1 && i10 != -1) {
            z9 = true;
        }
        if (z8 & z9) {
            RendererConfiguration rendererConfiguration = new RendererConfiguration(i9);
            rendererConfigurationArr[i11] = rendererConfiguration;
            rendererConfigurationArr[i10] = rendererConfiguration;
        }
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, TrackGroupArray trackGroupArray, TrackSelection trackSelection) {
        if (trackSelection == null) {
            return false;
        }
        int indexOf = trackGroupArray.indexOf(trackSelection.getTrackGroup());
        for (int i9 = 0; i9 < trackSelection.length(); i9++) {
            if ((iArr[indexOf][trackSelection.getIndexInTrackGroup(i9)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    private static TrackSelection selectAdaptiveVideoTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i9, Parameters parameters, TrackSelection.Factory factory) throws ExoPlaybackException {
        int i10;
        boolean z8;
        if (parameters.allowNonSeamlessAdaptiveness) {
            i10 = 24;
        } else {
            i10 = 16;
        }
        if (parameters.allowMixedMimeAdaptiveness && (i9 & i10) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        for (int i11 = 0; i11 < trackGroupArray.length; i11++) {
            TrackGroup trackGroup = trackGroupArray.get(i11);
            int[] adaptiveVideoTracksForGroup = getAdaptiveVideoTracksForGroup(trackGroup, iArr[i11], z8, i10, parameters.maxVideoWidth, parameters.maxVideoHeight, parameters.maxVideoBitrate, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
            if (adaptiveVideoTracksForGroup.length > 0) {
                return ((TrackSelection.Factory) Assertions.checkNotNull(factory)).createTrackSelection(trackGroup, adaptiveVideoTracksForGroup);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (compareFormatValues(r2.bitrate, r10) < 0) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection selectFixedVideoTrack(com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray r18, int[][] r19, com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.Parameters r20) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.selectFixedVideoTrack(com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray, int[][], com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector$Parameters):com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection");
    }

    public ParametersBuilder buildUponParameters() {
        return getParameters().buildUpon();
    }

    public final void clearSelectionOverride(int i9, TrackGroupArray trackGroupArray) {
        setParameters(buildUponParameters().clearSelectionOverride(i9, trackGroupArray));
    }

    public final void clearSelectionOverrides(int i9) {
        setParameters(buildUponParameters().clearSelectionOverrides(i9));
    }

    public Parameters getParameters() {
        return this.parametersReference.get();
    }

    public final boolean getRendererDisabled(int i9) {
        return getParameters().getRendererDisabled(i9);
    }

    public final SelectionOverride getSelectionOverride(int i9, TrackGroupArray trackGroupArray) {
        return getParameters().getSelectionOverride(i9, trackGroupArray);
    }

    public final boolean hasSelectionOverride(int i9, TrackGroupArray trackGroupArray) {
        return getParameters().hasSelectionOverride(i9, trackGroupArray);
    }

    public TrackSelection[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
        TrackSelection.Factory factory;
        int rendererCount = mappedTrackInfo.getRendererCount();
        TrackSelection[] trackSelectionArr = new TrackSelection[rendererCount];
        boolean z8 = false;
        int i9 = 0;
        boolean z9 = false;
        while (true) {
            boolean z10 = true;
            if (i9 >= rendererCount) {
                break;
            }
            if (2 == mappedTrackInfo.getRendererType(i9)) {
                if (!z8) {
                    TrackSelection selectVideoTrack = selectVideoTrack(mappedTrackInfo.getTrackGroups(i9), iArr[i9], iArr2[i9], parameters, this.adaptiveTrackSelectionFactory);
                    trackSelectionArr[i9] = selectVideoTrack;
                    if (selectVideoTrack != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                }
                if (mappedTrackInfo.getTrackGroups(i9).length <= 0) {
                    z10 = false;
                }
                z9 |= z10;
            }
            i9++;
        }
        boolean z11 = false;
        boolean z12 = false;
        for (int i10 = 0; i10 < rendererCount; i10++) {
            int rendererType = mappedTrackInfo.getRendererType(i10);
            if (rendererType != 1) {
                if (rendererType != 2) {
                    if (rendererType != 3) {
                        trackSelectionArr[i10] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i10), iArr[i10], parameters);
                    } else if (!z12) {
                        TrackSelection selectTextTrack = selectTextTrack(mappedTrackInfo.getTrackGroups(i10), iArr[i10], parameters);
                        trackSelectionArr[i10] = selectTextTrack;
                        if (selectTextTrack != null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                }
            } else if (!z11) {
                TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i10);
                int[][] iArr3 = iArr[i10];
                int i11 = iArr2[i10];
                if (z9) {
                    factory = null;
                } else {
                    factory = this.adaptiveTrackSelectionFactory;
                }
                TrackSelection selectAudioTrack = selectAudioTrack(trackGroups, iArr3, i11, parameters, factory);
                trackSelectionArr[i10] = selectAudioTrack;
                if (selectAudioTrack != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
        }
        return trackSelectionArr;
    }

    public TrackSelection selectAudioTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i9, Parameters parameters, TrackSelection.Factory factory) throws ExoPlaybackException {
        int i10 = -1;
        int i11 = -1;
        AudioTrackScore audioTrackScore = null;
        for (int i12 = 0; i12 < trackGroupArray.length; i12++) {
            TrackGroup trackGroup = trackGroupArray.get(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < trackGroup.length; i13++) {
                if (isSupported(iArr2[i13], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    AudioTrackScore audioTrackScore2 = new AudioTrackScore(trackGroup.getFormat(i13), parameters, iArr2[i13]);
                    if (audioTrackScore == null || audioTrackScore2.compareTo(audioTrackScore) > 0) {
                        i10 = i12;
                        i11 = i13;
                        audioTrackScore = audioTrackScore2;
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        TrackGroup trackGroup2 = trackGroupArray.get(i10);
        if (!parameters.forceLowestBitrate && factory != null) {
            int[] adaptiveAudioTracks = getAdaptiveAudioTracks(trackGroup2, iArr[i10], parameters.allowMixedMimeAdaptiveness);
            if (adaptiveAudioTracks.length > 0) {
                return factory.createTrackSelection(trackGroup2, adaptiveAudioTracks);
            }
        }
        return new FixedTrackSelection(trackGroup2, i11);
    }

    public TrackSelection selectOtherTrack(int i9, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        TrackGroup trackGroup = null;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < trackGroupArray.length; i12++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < trackGroup2.length; i13++) {
                if (isSupported(iArr2[i13], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    int i14 = 1;
                    if ((trackGroup2.getFormat(i13).selectionFlags & 1) != 0) {
                        i14 = 2;
                    }
                    if (isSupported(iArr2[i13], false)) {
                        i14 += 1000;
                    }
                    if (i14 > i11) {
                        trackGroup = trackGroup2;
                        i10 = i13;
                        i11 = i14;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new FixedTrackSelection(trackGroup, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackSelection selectTextTrack(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        byte b;
        byte b8;
        int i9;
        int i10 = 0;
        int i11 = 0;
        TrackGroup trackGroup = null;
        for (int i12 = 0; i12 < trackGroupArray.length; i12++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < trackGroup2.length; i13++) {
                if (isSupported(iArr2[i13], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    Format format = trackGroup2.getFormat(i13);
                    int i14 = format.selectionFlags & (~parameters.disabledTextTrackSelectionFlags);
                    int i15 = 1;
                    if ((i14 & 1) != 0) {
                        b = true;
                    } else {
                        b = false;
                    }
                    if ((i14 & 2) != 0) {
                        b8 = true;
                    } else {
                        b8 = false;
                    }
                    boolean formatHasLanguage = formatHasLanguage(format, parameters.preferredTextLanguage);
                    if (!formatHasLanguage && (!parameters.selectUndeterminedTextLanguage || !formatHasNoLanguage(format))) {
                        if (b != false) {
                            i15 = 3;
                        } else if (b8 != false) {
                            if (formatHasLanguage(format, parameters.preferredAudioLanguage)) {
                                i15 = 2;
                            }
                        }
                    } else {
                        if (b != false) {
                            i9 = 8;
                        } else if (b8 == false) {
                            i9 = 6;
                        } else {
                            i9 = 4;
                        }
                        i15 = i9 + (formatHasLanguage ? 1 : 0);
                    }
                    if (isSupported(iArr2[i13], false)) {
                        i15 += 1000;
                    }
                    if (i15 > i11) {
                        trackGroup = trackGroup2;
                        i10 = i13;
                        i11 = i15;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new FixedTrackSelection(trackGroup, i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.MappingTrackSelector
    public final Pair<RendererConfiguration[], TrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2) throws ExoPlaybackException {
        RendererConfiguration rendererConfiguration;
        Parameters parameters = this.parametersReference.get();
        int rendererCount = mappedTrackInfo.getRendererCount();
        TrackSelection[] selectAllTracks = selectAllTracks(mappedTrackInfo, iArr, iArr2, parameters);
        for (int i9 = 0; i9 < rendererCount; i9++) {
            if (parameters.getRendererDisabled(i9)) {
                selectAllTracks[i9] = null;
            } else {
                TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i9);
                if (parameters.hasSelectionOverride(i9, trackGroups)) {
                    SelectionOverride selectionOverride = parameters.getSelectionOverride(i9, trackGroups);
                    if (selectionOverride == null) {
                        selectAllTracks[i9] = null;
                    } else if (selectionOverride.length == 1) {
                        selectAllTracks[i9] = new FixedTrackSelection(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks[0]);
                    } else {
                        selectAllTracks[i9] = ((TrackSelection.Factory) Assertions.checkNotNull(this.adaptiveTrackSelectionFactory)).createTrackSelection(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks);
                    }
                }
            }
        }
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[rendererCount];
        for (int i10 = 0; i10 < rendererCount; i10++) {
            if (!parameters.getRendererDisabled(i10) && (mappedTrackInfo.getRendererType(i10) == 5 || selectAllTracks[i10] != null)) {
                rendererConfiguration = RendererConfiguration.DEFAULT;
            } else {
                rendererConfiguration = null;
            }
            rendererConfigurationArr[i10] = rendererConfiguration;
        }
        maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, selectAllTracks, parameters.tunnelingAudioSessionId);
        return Pair.create(rendererConfigurationArr, selectAllTracks);
    }

    public TrackSelection selectVideoTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i9, Parameters parameters, TrackSelection.Factory factory) throws ExoPlaybackException {
        TrackSelection trackSelection;
        if (!parameters.forceLowestBitrate && factory != null) {
            trackSelection = selectAdaptiveVideoTrack(trackGroupArray, iArr, i9, parameters, factory);
        } else {
            trackSelection = null;
        }
        if (trackSelection == null) {
            return selectFixedVideoTrack(trackGroupArray, iArr, parameters);
        }
        return trackSelection;
    }

    public void setParameters(Parameters parameters) {
        Assertions.checkNotNull(parameters);
        if (this.parametersReference.getAndSet(parameters).equals(parameters)) {
            return;
        }
        invalidate();
    }

    public final void setRendererDisabled(int i9, boolean z8) {
        setParameters(buildUponParameters().setRendererDisabled(i9, z8));
    }

    public final void setSelectionOverride(int i9, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
        setParameters(buildUponParameters().setSelectionOverride(i9, trackGroupArray, selectionOverride));
    }

    public void setTunnelingAudioSessionId(int i9) {
        setParameters(buildUponParameters().setTunnelingAudioSessionId(i9));
    }

    public DefaultTrackSelector(BandwidthMeter bandwidthMeter) {
        this(new AdaptiveTrackSelection.Factory(bandwidthMeter));
    }

    public final void clearSelectionOverrides() {
        setParameters(buildUponParameters().clearSelectionOverrides());
    }

    public DefaultTrackSelector(TrackSelection.Factory factory) {
        this.adaptiveTrackSelectionFactory = factory;
        this.parametersReference = new AtomicReference<>(Parameters.DEFAULT);
    }

    public void setParameters(ParametersBuilder parametersBuilder) {
        setParameters(parametersBuilder.build());
    }

    /* loaded from: classes3.dex */
    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new Parcelable.Creator<SelectionOverride>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SelectionOverride createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SelectionOverride[] newArray(int i9) {
                return new SelectionOverride[i9];
            }
        };
        public final int groupIndex;
        public final int length;
        public final int[] tracks;

        public SelectionOverride(int i9, int... iArr) {
            this.groupIndex = i9;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.tracks = copyOf;
            this.length = iArr.length;
            Arrays.sort(copyOf);
        }

        public final boolean containsTrack(int i9) {
            for (int i10 : this.tracks) {
                if (i10 == i9) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            if (this.groupIndex == selectionOverride.groupIndex && Arrays.equals(this.tracks, selectionOverride.tracks)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.tracks) + (this.groupIndex * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i9) {
            parcel.writeInt(this.groupIndex);
            parcel.writeInt(this.tracks.length);
            parcel.writeIntArray(this.tracks);
        }

        public SelectionOverride(Parcel parcel) {
            this.groupIndex = parcel.readInt();
            int readByte = parcel.readByte();
            this.length = readByte;
            int[] iArr = new int[readByte];
            this.tracks = iArr;
            parcel.readIntArray(iArr);
        }
    }
}
