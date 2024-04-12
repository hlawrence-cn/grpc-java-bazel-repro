java_binary(
    name = "code",
    srcs = glob(["src/main/java/**/*.java"]),
    main_class="com.example.helloworld.HelloWorld",
    deps = [
        "@grpc-java//services:health", "@grpc-java//api", "@grpc-java//core",
        "@grpc-java//stub", "@maven//:com_google_guava_guava", 
    ]
)