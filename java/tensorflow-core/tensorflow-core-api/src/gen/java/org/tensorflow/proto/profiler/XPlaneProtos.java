// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/profiler/protobuf/xplane.proto

package org.tensorflow.proto.profiler;

public final class XPlaneProtos {
  private XPlaneProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_profiler_XSpace_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_profiler_XSpace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_profiler_XPlane_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_profiler_XPlane_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_profiler_XPlane_EventMetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_profiler_XPlane_EventMetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_profiler_XPlane_StatMetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_profiler_XPlane_StatMetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_profiler_XLine_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_profiler_XLine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_profiler_XEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_profiler_XEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_profiler_XStat_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_profiler_XStat_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_profiler_XEventMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_profiler_XEventMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_profiler_XStatMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_profiler_XStatMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.tensorflow/core/profiler/protobuf/xpla" +
      "ne.proto\022\023tensorflow.profiler\"W\n\006XSpace\022" +
      "+\n\006planes\030\001 \003(\0132\033.tensorflow.profiler.XP" +
      "lane\022\016\n\006errors\030\002 \003(\t\022\020\n\010warnings\030\003 \003(\t\"\272" +
      "\003\n\006XPlane\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022)\n\005l" +
      "ines\030\003 \003(\0132\032.tensorflow.profiler.XLine\022F" +
      "\n\016event_metadata\030\004 \003(\0132..tensorflow.prof" +
      "iler.XPlane.EventMetadataEntry\022D\n\rstat_m" +
      "etadata\030\005 \003(\0132-.tensorflow.profiler.XPla" +
      "ne.StatMetadataEntry\022)\n\005stats\030\006 \003(\0132\032.te" +
      "nsorflow.profiler.XStat\032Y\n\022EventMetadata" +
      "Entry\022\013\n\003key\030\001 \001(\003\0222\n\005value\030\002 \001(\0132#.tens" +
      "orflow.profiler.XEventMetadata:\0028\001\032W\n\021St" +
      "atMetadataEntry\022\013\n\003key\030\001 \001(\003\0221\n\005value\030\002 " +
      "\001(\0132\".tensorflow.profiler.XStatMetadata:" +
      "\0028\001\"\273\001\n\005XLine\022\n\n\002id\030\001 \001(\003\022\022\n\ndisplay_id\030" +
      "\n \001(\003\022\014\n\004name\030\002 \001(\t\022\024\n\014display_name\030\013 \001(" +
      "\t\022\024\n\014timestamp_ns\030\003 \001(\003\022\023\n\013duration_ps\030\t" +
      " \001(\003\022+\n\006events\030\004 \003(\0132\033.tensorflow.profil" +
      "er.XEventJ\004\010\005\020\006J\004\010\006\020\007J\004\010\007\020\010J\004\010\010\020\t\"\225\001\n\006XE" +
      "vent\022\023\n\013metadata_id\030\001 \001(\003\022\023\n\toffset_ps\030\002" +
      " \001(\003H\000\022\031\n\017num_occurrences\030\005 \001(\003H\000\022\023\n\013dur" +
      "ation_ps\030\003 \001(\003\022)\n\005stats\030\004 \003(\0132\032.tensorfl" +
      "ow.profiler.XStatB\006\n\004data\"\255\001\n\005XStat\022\023\n\013m" +
      "etadata_id\030\001 \001(\003\022\026\n\014double_value\030\002 \001(\001H\000" +
      "\022\026\n\014uint64_value\030\003 \001(\004H\000\022\025\n\013int64_value\030" +
      "\004 \001(\003H\000\022\023\n\tstr_value\030\005 \001(\tH\000\022\025\n\013bytes_va" +
      "lue\030\006 \001(\014H\000\022\023\n\tref_value\030\007 \001(\004H\000B\007\n\005valu" +
      "e\"R\n\016XEventMetadata\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030" +
      "\002 \001(\t\022\024\n\014display_name\030\004 \001(\t\022\020\n\010metadata\030" +
      "\003 \001(\014\">\n\rXStatMetadata\022\n\n\002id\030\001 \001(\003\022\014\n\004na" +
      "me\030\002 \001(\t\022\023\n\013description\030\003 \001(\tB2\n\035org.ten" +
      "sorflow.proto.profilerB\014XPlaneProtosP\001\370\001" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tensorflow_profiler_XSpace_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_profiler_XSpace_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_profiler_XSpace_descriptor,
        new java.lang.String[] { "Planes", "Errors", "Warnings", });
    internal_static_tensorflow_profiler_XPlane_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_profiler_XPlane_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_profiler_XPlane_descriptor,
        new java.lang.String[] { "Id", "Name", "Lines", "EventMetadata", "StatMetadata", "Stats", });
    internal_static_tensorflow_profiler_XPlane_EventMetadataEntry_descriptor =
      internal_static_tensorflow_profiler_XPlane_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_profiler_XPlane_EventMetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_profiler_XPlane_EventMetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_profiler_XPlane_StatMetadataEntry_descriptor =
      internal_static_tensorflow_profiler_XPlane_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_profiler_XPlane_StatMetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_profiler_XPlane_StatMetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_profiler_XLine_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_profiler_XLine_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_profiler_XLine_descriptor,
        new java.lang.String[] { "Id", "DisplayId", "Name", "DisplayName", "TimestampNs", "DurationPs", "Events", });
    internal_static_tensorflow_profiler_XEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_profiler_XEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_profiler_XEvent_descriptor,
        new java.lang.String[] { "MetadataId", "OffsetPs", "NumOccurrences", "DurationPs", "Stats", "Data", });
    internal_static_tensorflow_profiler_XStat_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_profiler_XStat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_profiler_XStat_descriptor,
        new java.lang.String[] { "MetadataId", "DoubleValue", "Uint64Value", "Int64Value", "StrValue", "BytesValue", "RefValue", "Value", });
    internal_static_tensorflow_profiler_XEventMetadata_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_profiler_XEventMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_profiler_XEventMetadata_descriptor,
        new java.lang.String[] { "Id", "Name", "DisplayName", "Metadata", });
    internal_static_tensorflow_profiler_XStatMetadata_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_profiler_XStatMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_profiler_XStatMetadata_descriptor,
        new java.lang.String[] { "Id", "Name", "Description", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}