def call(String gitUrl, String gitBranch) {
    checkoutGit([
        $class: 'GitSCM',
        branches: [[name: gitBranch]],
        userRemoteConfigs: [[url: gitUrl]]
    ])
}
